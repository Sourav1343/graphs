// Adjacency List representation
class AdjList {
    private int v;
    private AdjNode[] graph;

    public AdjList(int vertices) {
        v = vertices;
        graph = new AdjNode[v];
        for (int i = 0; i < v; ++i) {
            graph[i] = null;
        }
    }

    // Function to print the graph
    public void printGraph() {
        for (int i = 0; i < v; ++i) {
            System.out.print(i + " ");
            AdjNode temp = graph[i];
            while (temp != null) {
                System.out.print("-> " + temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Method to get the graph array (for use in other classes)
    protected AdjNode[] getGraph() {
        return graph;
    }

    // Method to get the number of vertices (for use in other classes)
    protected int getVertexCount() {
        return v;
    }
}
