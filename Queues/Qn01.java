

// import java.util.*;

// public class Qn01 {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queues {
//         Node head = null;
//         Node tail = null;

//         public boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         // add
//         public void add(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }
//         // Remove
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queues isEmpty...");
//                 return -1;
//             }
//             int front = head.data;
//             if(tail == head){
//                 tail = head = null;
//             } else{
//                 head = head.next;
//             }
//             return front;
//         }
//         // peek
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queues isEmpty....");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queues q = new Queues();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// OR 




import java.util.*;

public class Qn01 {
    
    public static void main(String[] args) {
        
    
        // Queue<Integer> q =new LinkedList<>() ;
        Queue<Integer> q = new ArrayDeque<>() {
            
        };
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} 