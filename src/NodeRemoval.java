public class NodeRemoval {
    private AdjList adjList;

    public NodeRemoval(AdjList adjList) {
        this.adjList = adjList;
    }

    // Function to delete a vertex
    public void deleteVertex(int k) {
        AdjNode[] graph = adjList.getGraph();
        int v = adjList.getVertexCount();

        // Iterate through all the vertices of the graph
        for (int i = 0; i < v; ++i) {
            AdjNode temp = graph[i];
            // Remove vertex k from the adjacency list of vertex i
            if (i == k) {
                graph[i] = temp.next;
                temp = graph[i];
            }
            while (temp != null) {
                if (temp.vertex == k) {
                    break;
                }
                AdjNode prev = temp;
                temp = temp.next;
                if (temp == null) {
                    continue;
                }
                prev.next = temp.next;
                temp = null;
            }
        }
    }
}
