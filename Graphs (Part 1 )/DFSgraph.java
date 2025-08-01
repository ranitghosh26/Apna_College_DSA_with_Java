import java.util.*;

public class DFSgraph {
    static class Edge {
        int srs;
        int dist;
        int wt;

        public Edge( int s, int d, int w){
            this.srs = s;
            this.dist=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));


        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(0, 0, 1));
        graph[2].add(new Edge(0, 4, 1));


        graph[3].add(new Edge(0, 1, 1));
        graph[3].add(new Edge(0, 4, 1));
        graph[3].add(new Edge(0, 5, 1));


        graph[4].add(new Edge(0, 2, 1));
        graph[4].add(new Edge(0, 3, 1));
        graph[4].add(new Edge(0, 5, 1));

        graph[5].add(new Edge(0, 3, 1));
        graph[5].add(new Edge(0, 4, 1));
        graph[5].add(new Edge(0, 6, 1));

        graph[5].add(new Edge(6, 5, 1));
    }


    // ...existing code...
    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);
        vis[0] = true; // Mark the starting node as visited

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); // Print the current node

            for(int i=0; i<graph[curr].size();i++) {
                Edge e = graph[curr].get(i);
                if(!vis[e.dist]) {
                    q.add(e.dist);
                    vis[e.dist] = true; // Mark as visited when enqueued
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;


        for(int i=0; i<graph[curr].size(); i++) {
            Edge e =graph[curr].get(i);
            if(!vis[e.dist]) {
                dfs(graph, e.dist, vis);
            }
        }
    }

    public static void main(String[] args) {
        
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        dfs(graph,0, new boolean[v]);



    }
    
}
