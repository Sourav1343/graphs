import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GraphApp extends Application {

    private ArrayList<ArrayList<Integer>> graph;
    private List<List<Integer>> edges;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graph Visualization");

        // Initialize graph and edges
        graph = GraphManager.initializeGraph();
        edges = GraphManager.initializeEdges();
        GraphManager.addEdges(graph, edges);

        // Create UI elements
        Label titleLabel = new Label("Graph Visualization");
        TextArea graphTextArea = new TextArea();
        graphTextArea.setEditable(false);
        updateGraphTextArea(graphTextArea);

        Button updateButton = new Button("Update Graph");
        updateButton.setOnAction(event -> {
            // Example of updating the graph, here you could add your logic to update the graph
            GraphManager.addEdges(graph, edges); // Re-add edges as an example
            updateGraphTextArea(graphTextArea);
        });

        Button printMatrixButton = new Button("Print Adjacency Matrix");
        printMatrixButton.setOnAction(event -> {
            int numVertices = graph.size();
            int[][] adjMatrix = AdjacenyMatrixGraph.createAdjacencyMatrix(graph, numVertices);
            String matrixString = getMatrixString(adjMatrix);
            graphTextArea.setText("Adjacency Matrix:\n" + matrixString);
        });

        Button printListButton = new Button("Print Adjacency List");
        printListButton.setOnAction(event -> {
            List<List<Integer>> adjList = AdjacencyListGraph.createAdjacencyList(edges, graph.size());
            String listString = getListString(adjList);
            graphTextArea.setText("Adjacency List:\n" + listString);
        });

        VBox vbox = new VBox(10, titleLabel, graphTextArea, updateButton, printMatrixButton, printListButton);
        Scene scene = new Scene(vbox, 600, 400); // Adjusted size for better visibility
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateGraphTextArea(TextArea textArea) {
        StringBuilder sb = new StringBuilder("Graph Details:\n");
        for (int i = 0; i < graph.size(); i++) {
            sb.append("Vertex ").append(i).append(": ").append(graph.get(i)).append("\n");
        }
        textArea.setText(sb.toString());
    }

    private String getMatrixString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private String getListString(List<List<Integer>> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append("Vertex ").append(i).append(" -> ");
            sb.append(String.join(" ", list.get(i).toString().replaceAll("[\\[\\],]", ""))).append("\n");
        }
        return sb.toString();
    }
}
