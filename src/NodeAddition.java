public class NodeAddition {
    private AdjList adjList;

    public NodeAddition(AdjList adjList) {
        this.adjList = adjList;
    }

    // Function to add an edge from a source vertex to a destination vertex
    public void addEdge(int source, int destination) {
        AdjNode node = new AdjNode(destination);
        node.next = adjList.getGraph()[source];
        adjList.getGraph()[source] = node;
    }

    // Function to add a vertex between two vertices
    public void addVertex(int vk, int source, int destination) {
        addEdge(source, vk);
        addEdge(vk, destination);
    }
}
