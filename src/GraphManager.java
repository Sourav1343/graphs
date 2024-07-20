import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphManager {

    public static ArrayList<ArrayList<Integer>> initializeGraph() {
        return new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(0, 1, 0, 0)),
                new ArrayList<>(Arrays.asList(1, 0, 1, 0)),
                new ArrayList<>(Arrays.asList(0, 1, 0, 1)),
                new ArrayList<>(Arrays.asList(0, 0, 1, 0))
        ));
    }

    public static List<List<Integer>> initializeEdges() {
        return Arrays.asList(
                List.of(0, 1), List.of(0, 2), List.of(1, 2),
                List.of(2, 3), List.of(3, 1)
        );
    }

    public static void addEdges(ArrayList<ArrayList<Integer>> graph, List<List<Integer>> edges) {
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).set(v, 1);
            graph.get(v).set(u, 1); // Assuming undirected graph
        }
    }
}
