import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimS {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,40));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

        //graph[4].add(new Edge(4,1,-1));
    }

    // Pair class to store vertex and cost for Prim's algorithm
    static class Pair  implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    // Prim's algorithm to find Minimum Spanning Tree (MST)

    public static void prims(ArrayList<Edge> graph [], int src){
        boolean vis[] =new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0)); // start with the source vertex
        int finalCost = 0;  


        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.v]) {
                vis[curr.v] = true; // mark the vertex as visited
                finalCost += curr.cost; // add the cost to the final cost

                // traverse all neighbours of the current vertex
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                        pq.add(new Pair(e.dest, e.wt)); // add it to the priority queue
                }
            }
            
        }
        // Output the total cost of the MST
        System.out.println("Total( MIN ) cost of MST =  " + finalCost);
    }
    public static void main(String args[]){

        int V = 4; //number of vertices

        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        prims(graph, 0);
    }

}