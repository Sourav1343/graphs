import java.util.ArrayList;

public class AdjacenyMatrixGraph {

    public static int[][] createAdjacencyMatrix(ArrayList<ArrayList<Integer>> graph, int numVertices) {
        // Initialize the adjacency matrix with zeros
        int[][] adjMatrix = new int[numVertices][numVertices];
        System.out.println("Initialized adjacency matrix with zeros.");

        // Fill the adjacency matrix based on the edges in the graph
        for (int i = 0; i < numVertices; ++i) {
            for (int j = 0; j < numVertices; ++j) {
                if (graph.get(i).get(j) == 1) {
                    adjMatrix[i][j] = 1;
                    adjMatrix[j][i] = 1; // For undirected graph, set symmetric entries
                    System.out.println("Edge added between vertex " + i + " and vertex " + j);
                }
            }
        }
        return adjMatrix;
    }
}
