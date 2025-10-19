import java.util.Comparator;
import java.util.PriorityQueue;



// public class PQjcf {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(3);
//         pq.add(4);
//         pq.add(7);
//         pq.add(1);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }   
//     }
// }

public class PQjcf {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(1);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }   
    }
}