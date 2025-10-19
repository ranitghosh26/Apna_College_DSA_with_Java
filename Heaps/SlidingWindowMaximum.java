import java.util.*;  

// Time Complexity: O(n log k) 
// Space Complexity: O(k)

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            //return this.val - o.val; // min heap (Assending order)
            return o.val - this.val; // max heap (Descending order)
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window -> i = 0 to k-1
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val; // max of 1st window

        for(int i=k;i<arr.length;i++){
            // remove elements not in the window
            while(!pq.isEmpty() && pq.peek().idx <= i-k){
                pq.remove();
            }
            // add new element 
            pq.add(new Pair(arr[i], i));
            // store max of current window
            res[i-k+1] = pq.peek().val;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
