import java.util.*;

public interface Graph {

    int vertexCount();

    int getWeight(int v1, int v2);

    int edgeCount();

    void addAdge(int v1, int v2, int weight);

    void removeAdge(int v1, int v2);

    Iterable<Integer> adjacencies(int v);

    default boolean isAdj(int v1, int v2) {
        for (Integer adj : adjacencies(v1)) {
            if (adj == v2) {
                return true;
            }
        }
        return false;
    }

    default boolean[][] minTree(){
        boolean[][] tree = new boolean[vertexCount()][vertexCount()];
        boolean[] visit = new boolean[vertexCount()];
        ArrayList<Integer> vertex = new ArrayList<>();
        vertex.add(0);
        visit[0] = true;

        while (vertex.size() < vertexCount()){
            int minWeight = Integer.MAX_VALUE;
            int v1 = 0;
            int v2 = 0;
            for(Integer v: vertex){
                for(Integer vA: this.adjacencies(v)){
                    if(getWeight(v, vA) < minWeight && !vertex.contains(vA)){
                        minWeight = getWeight(v, vA);
                        v1 = v;
                        v2 = vA;
                    }
                }
            }
            vertex.add(v2);
            tree[v1][v2] = true;
            tree[v2][v1] = true;
        }
        return tree;
    }


    default Iterable<Integer> dfs(int from) {
        return new Iterable<Integer>() {
            private Stack<Integer> stack = null;
            private boolean[] visited = null;

            @Override
            public Iterator<Integer> iterator() {
                stack = new Stack<>();
                stack.push(from);
                visited = new boolean[Graph.this.vertexCount()];
                visited[from] = true;

                return new Iterator<Integer>() {
                    @Override
                    public boolean hasNext() {
                        return ! stack.isEmpty();
                    }

                    @Override
                    public Integer next() {
                        Integer result = stack.pop();
                        for (Integer adj : Graph.this.adjacencies(result)) {
                            if (!visited[adj]) {
                                visited[adj] = true;
                                stack.add(adj);
                            }
                        }
                        return result;
                    }
                };
            }
        };
    }


    default Iterable<Integer> bfs(int from) {
        return new Iterable<Integer>() {
            private Queue<Integer> queue = null;
            private boolean[] visited = null;

            @Override
            public Iterator<Integer> iterator() {
                queue = new LinkedList<>();
                queue.add(from);
                visited = new boolean[Graph.this.vertexCount()];
                visited[from] = true;

                return new Iterator<Integer>() {
                    @Override
                    public boolean hasNext() {
                        return ! queue.isEmpty();
                    }

                    @Override
                    public Integer next() {
                        Integer result = queue.remove();
                        for (Integer adj : Graph.this.adjacencies(result)) {
                            if (!visited[adj]) {
                                visited[adj] = true;
                                queue.add(adj);
                            }
                        }
                        return result;
                    }
                };
            }
        };
    }
}