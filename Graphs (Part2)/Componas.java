import java.util.*;

public class Componas {
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



    
    public static void bfs (ArrayList<Edge> graph[]) {
        boolean vis[]=new boolean[graph.length];
        for(int i=0; i<graph.length;i++) {
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }

    // ...existing code...
    public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        
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




    public static void  dfs(ArrayList<Edge> graph[]) {
        boolean vis[]= new boolean[ graph.length];
        for(int i=0; i<graph.length;i++) {
            dfsUtil(graph, i, vis);
        } 
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;


        for(int i=0; i<graph[curr].size(); i++) {
            Edge e =graph[curr].get(i);
            if(!vis[e.dist]) {
                dfsUtil(graph, e.dist, vis);
            }
        }
    }


    // public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
    //     if(src == dest) {
    //         return true;
    //     }

    //     vis[src] = true;

    //     for(int i=0; i<graph[src].size(); i++){
    //         Edge e = graph[src].get(i);

    //         if(!vis[e.dist] && hasPath(graph, e.dist, dest, vis)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        //System.out.println(hasPath(graph, 0, 5, new boolean[v]));



    }

}
