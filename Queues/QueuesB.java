
// import java.util.*;

// public class QueuesB {
//     static class Queues {
//         int arr[];
//         int size;
//         int rear;
        
//         Queues(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         public boolean isEmpty() {
//             return rear == -1;
//         }
//         // add
//         public void add(int data){
//             if(rear == size-1){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;
//         }
//         // Remove
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queues isEmpty...");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i = 0; i < rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear = rear - 1; 
//             return front;
//         }
//         // peek
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queues isEmpty....");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queues q = new Queues(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// Or 2nd Ansss :

import java.util.*;

public class QueuesB {
    static class Queues {
        int arr[];
        int size;
        int rear;
        int front;
        
        Queues(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front= -1;
        }
        public boolean isEmpty() {
            return rear == -1 && front== -1;
        }
        public boolean isFull(){
            return (rear+1)% size == front;
        }
        // add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // add 1st element
            if (front== -1) {
                front =0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data;
        }
        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queues isEmpty...");
                return -1;
            }
            int result =arr[front];

            // last element delete
            if(rear == front){
                rear = front=-1;
            }else{
                front = (front+1)% size;
            }
            return result;

        }
        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queues isEmpty....");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues(5);
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


