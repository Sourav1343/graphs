import javafx.application.Application;

/**
 * 1. Graph Traversal Algorithms
 * Depth-First Search (DFS):
 *
 * Explores as far as possible along each branch before backtracking.
 * Uses a stack (recursion stack or an explicit stack).
 * Applications: Topological sorting, finding connected components, pathfinding, cycle detection.
 * Breadth-First Search (BFS):
 *
 * Explores all neighbors at the present depth level before moving on to nodes at the next depth level.
 * Uses a queue.
 * Applications: Shortest path in unweighted graphs, level order traversal, finding connected components.
 * 2. Shortest Path Algorithmsfdggfdg
 * Dijkstra's Algorithm:
 *
 * Finds the shortest path from a single source node to all other nodes in a weighted graph.
 * Uses a priority queue.
 * Time complexity: O(V^2) with a simple array, O(E + V log V) with a priority queue.
 * Bellman-Ford Algorithm:
 *
 * Finds the shortest path from a single source node to all other nodes, even with negative weights.
 * Can detect negative weight cycles.
 * Time complexity: O(VE).
 * Floyd-Warshall Algorithm:
 *
 * Finds shortest paths between all pairs of nodes.
 * Uses dynamic programming.
 * Time complexity: O(V^3).
 * 3. Minimum Spanning Tree (MST) Algorithms
 * Kruskal's Algorithm:
 *
 * Finds an MST by sorting edges and adding them to the MST using the union-find data structure.
 * Time complexity: O(E log E).
 * Prim's Algorithm:
 *
 * Finds an MST by starting from a node and growing the MST one edge at a time.
 * Uses a priority queue.
 * Time complexity: O(V^2) with a simple array, O(E + V log V) with a priority queue.
 * 4. Topological Sorting
 * Kahn's Algorithm:
 *
 * Uses BFS to find the topological ordering of a Directed Acyclic Graph (DAG).
 * Time complexity: O(V + E).
 * DFS-based Algorithm:
 *
 * Uses DFS to find the topological ordering of a DAG by post-ordering the vertices.
 * Time complexity: O(V + E).
 * 5. Strongly Connected Components (SCC)
 * Kosaraju's Algorithm:
 *
 * Uses two passes of DFS to find all SCCs in a directed graph.
 * Time complexity: O(V + E).
 * Tarjan's Algorithm:
 *
 * Uses a single DFS to find all SCCs.
 * Time complexity: O(V + E).
 * 6. Cycle Detection
 * Undirected Graph:
 *
 * DFS/BFS can be used to detect cycles.
 * Uses parent tracking in DFS.
 * Directed Graph:
 *
 * DFS with recursion stack can detect cycles.
 * Kahn’s Algorithm for detecting cycles using topological sorting.
 * 7. Maximum Flow Algorithms
 * Ford-Fulkerson Algorithm:
 *
 * Computes the maximum flow in a flow network.
 * Uses DFS or BFS to find augmenting paths.
 * Time complexity: Depends on the method used for finding augmenting paths.
 * Edmonds-Karp Algorithm:
 *
 * An implementation of Ford-Fulkerson using BFS for finding augmenting paths.
 * Time complexity: O(VE^2).
 * 8. Bipartite Graph Checking
 * Two-Coloring:
 * Uses BFS or DFS to check if a graph can be colored with two colors.
 * Applications: Matching problems, scheduling problems.
 * Practical Scenarios:
 * Navigation Systems: Shortest path algorithms like Dijkstra's and A*.
 * Social Networks: BFS for finding the shortest path or degree of separation.
 * Internet Routing: Dijkstra's algorithm for finding shortest paths.
 * Scheduling: Topological sorting for task scheduling.
 */

public class Main {

    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(GraphApp.class, args);
    }
}
