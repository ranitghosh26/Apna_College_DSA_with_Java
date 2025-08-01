import java.util.*;

public class CycleDetection {
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
        //graph[0].add(new Edge(0, 2, 1));


        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        //graph[2].add(new Edge(0, 0, 1));
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


    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[]= new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;

                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            // case
            if(!vis[e.dist]) {
                if ( detectCycleUtil(graph, vis, e.dist, curr)) {
                    return true;
                }
                return true;
            }
            // case 1
            else if(vis[e.dist] && e.dist != par ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);


        System.out.println(detectCycle(graph));



    }
}
