import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph graph = new AdjMatrixGraph(4);
        graph.addAdge(0,1, 1);
        graph.addAdge(1,2, 3);
        graph.addAdge(0,2, 2);
        graph.addAdge(2,3, 1);

        System.out.print("Обход в глубину: ");
        for(Integer i : graph.dfs(0)){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Обход в ширину: ");
        for(Integer i : graph.bfs(0)){
            System.out.print(i + " ");
        }

        System.out.println();

        for(boolean[] array: graph.minTree()){
            System.out.println(Arrays.toString(array));
        }
    }
}
