import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph {


    public static List<List<Integer>>
    createAdjacencyList(List<List<Integer> > edges,
                        int numVertices) {
        // Initialize the adjacency list
        List<List<Integer>> adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println("Initialized adjacency list with empty lists for each vertex.");

        // Fill the adjacency list based on the edges in the graph
        System.out.println("Adding edges to the adjacency list:");
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            // Since the graph is undirected, add the edge in both directions
            adjList.get(u).add(v);
            adjList.get(v).add(u);
            System.out.println("Added edge between vertex " + u + " and vertex " + v);
        }

        return adjList;
    }}
