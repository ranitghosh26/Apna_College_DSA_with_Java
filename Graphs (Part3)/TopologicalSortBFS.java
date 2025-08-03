import java.util.*;

public class TopologicalSortBFS {
    // A DAG has at least one vertex with in-degree 0. and one vertex with out-degree 0.
    static  class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    // Create a graph using adjacency list representation
    static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length;i++){
            graph[i]  = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Function to perform topological sort using BFS (Kahn's algorithm)
    public static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    // Main method to demonstrate the graph creation
    public static void Graph(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new java.util.LinkedList<>();

        // Enqueue all vertices with in-degree 0
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        // Process the queue BFS style
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            // Decrease the in-degree of all neighbors
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                // If in-degree becomes 0, add to queue
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println("Topological Sort using BFS (Kahn's algorithm): ");
        Graph(graph);
    }

}