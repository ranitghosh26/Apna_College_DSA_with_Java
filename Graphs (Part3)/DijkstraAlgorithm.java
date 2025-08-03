import java.util.*;

public class DijkstraAlgorithm {
    static  class Edge {
        int src, dest, wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    // Create a graph using adjacency list representation
    static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length;i++){
            graph[i]  = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        // graph[5].add(new Edge(5, 0, 1));
        // graph[5].add(new Edge(5, 2, 1));
    }

    // // Function to print all paths from source to target
    // // This function uses DFS to explore all paths from src to dest

    // public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, String path) {
    //     if (src == dest) {
    //         System.out.println(path + dest);
    //         return;
    //     } 
        
    //     for(int i =0 ; i<graph[src].size();i++) {
    //         Edge e = graph[src].get(i);
    //         printAllPaths(graph, e.dest, dest, path + src + " -> ");
    //     }
    // }

    // Function to implement Dijkstra's algorithm

    static class Pair implements Comparable<Pair> {
        int n, path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2 ) {
            return this.path - p2.path;
        }
    }

    // Dijkstra's algorithm to find the shortest path from source to all vertices
    

    public static  void dijkstra (ArrayList<Edge>[] graph, int src) {
        int dist[]  = new int[graph.length]; // Distance from source to each vertex

        for(int i=0; i<graph.length;i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity
            } 
        }
        boolean vis[] = new boolean[graph.length]; // Visited array to track visited vertices
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0)); // Add the source vertex with distance 0

        // loop

        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] =true; // Mark the current vertex as visited
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e= graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // If the destination vertex has not been visited and the distance can be updated
                    if(dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v])); // Add the updated distance to the priority queue
                    
                    }
                }
            }
        }
        // Print the shortest distances from source to all vertices
        for(int i=0; i<dist.length;i++) {
            System.out.println("Distance from source to " + i + " is " + dist[i]);
        }
        System.out.println();
    
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        //System.out.println("Topological Sort using BFS (Kahn's algorithm): ");
       // Graph(graph);
        // int src = 5; // Starting vertex
         //int dest = 1; // Target vertex

            //System.out.println("All paths from source " + src + " to target " + dest + ":");
            //printAllPaths(graph, src, dest, " ");
        int src = 0; // Starting vertex
        System.out.println("Dijkstra's algorithm from source " + src + ":");
        dijkstra(graph, src);
    }
}
