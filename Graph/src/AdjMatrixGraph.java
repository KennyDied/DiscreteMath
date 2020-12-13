import java.util.Arrays;
import java.util.Iterator;

/**
 * Реализация графа на основе матрицы смежности
 */
public class AdjMatrixGraph implements Graph {

    private int[][] adjMatrix = null;
    private int vCount = 0;
    private int eCount = 0;

    public AdjMatrixGraph(int vertexCount) {
        adjMatrix = new int[vertexCount][vertexCount];
        vCount = vertexCount;
    }

    public AdjMatrixGraph() {
        this(0);
    }

    @Override
    public int vertexCount() {
        return vCount;
    }

    @Override
    public int getWeight(int v1, int v2) {
        return adjMatrix[v1][v2];
    }

    @Override
    public int edgeCount() {
        return eCount;
    }

    @Override
    public void addAdge(int v1, int v2, int weight) {
        int maxV = Math.max(v1, v2);
        if (maxV >= vertexCount()) {
            adjMatrix = Arrays.copyOf(adjMatrix, maxV + 1);
            for (int i = 0; i <= maxV; i++) {
                adjMatrix[i] = i < vCount ? Arrays.copyOf(adjMatrix[i], maxV + 1) : new int[maxV + 1];
            }
            vCount = maxV + 1;
        }
        if (adjMatrix[v1][v2] == 0) {
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
            eCount++;
        }
    }

    @Override
    public void removeAdge(int v1, int v2) {
        if (adjMatrix[v1][v2] > 0) {
            adjMatrix[v1][v2] = 0;
            eCount--;
        }
    }

    @Override
    public Iterable<Integer> adjacencies(int v) {
        return new Iterable<Integer>() {
            Integer nextAdj = null;

            @Override
            public Iterator<Integer> iterator() {
                for (int i = 0; i < vCount; i++) {
                    if (adjMatrix[v][i] > 0) {
                        nextAdj = i;
                        break;
                    }
                }

                return new Iterator<Integer>() {
                    @Override
                    public boolean hasNext() {
                        return nextAdj != null;
                    }

                    @Override
                    public Integer next() {
                        Integer result = nextAdj;
                        nextAdj = null;
                        for (int i = result + 1; i < vCount; i++) {
                            if (adjMatrix[v][i] > 0) {
                                nextAdj = i;
                                break;
                            }
                        }
                        return result;
                    }
                };
            }
        };
    }
}
