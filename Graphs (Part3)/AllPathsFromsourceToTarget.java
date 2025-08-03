import java.util.*;

public class AllPathsFromsourceToTarget {
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
        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Function to print all paths from source to target
    // This function uses DFS to explore all paths from src to dest

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        } 
        
        for(int i =0 ; i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            printAllPaths(graph, e.dest, dest, path + src + " -> ");
        }
    }



    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println("Topological Sort using BFS (Kahn's algorithm): ");
       // Graph(graph);
         int src = 5; // Starting vertex
         int dest = 1; // Target vertex

            System.out.println("All paths from source " + src + " to target " + dest + ":");
            printAllPaths(graph, src, dest, " ");
    }

}
