import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSqr;
        int idx;

        Point(int x, int y,int distSqr, int idx){
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSqr - p2.distSqr; // min heap
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int x = pts[i][0];
            int y = pts[i][1];
            int distSqr = x*x + y*y;

            Point p = new Point(x, y, distSqr, i);
            pq.add(p);
        }

        for(int i=0; i<k; i++){
            System.out.println(("C"+pq.remove().idx));
            //Point p = pq.remove();
            //System.out.println("x: " + p.x + " y: " + p.y);
        }
    }
}
