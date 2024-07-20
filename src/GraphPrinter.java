import java.util.List;

public class GraphPrinter {

    public static void printGraph(int[][] adjMatrix, List<List<Integer>> adjList, int numVertices, String type) {
        System.out.println("Printing " + type + ":");
        if ("matrix".equals(type)) {
            for (int[] row : adjMatrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } else if ("list".equals(type)) {
            for (int i = 0; i < numVertices; i++) {
                System.out.print("Vertex " + i + " -> ");
                System.out.println(String.join(" ", adjList.get(i).toString().replaceAll("[\\[\\],]", "")));
            }
        } else {
            System.out.println("Unknown graph type: " + type);
        }
    }
}
