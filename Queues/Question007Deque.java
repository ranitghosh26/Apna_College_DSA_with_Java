import java.util.*;

public class Question007Deque {

    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        // push
        public void push(int data){
            deque.addLast(data);
        }

        // pop
        public int pop(){
            return deque.removeLast();
        }

        // peek
        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();
        
        // add data
        public void add(int data){
            deque.addLast(data);
        }

        // Remove 

        public int remove(){
            return deque.removeFirst();
        }

        // peek 

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);


        System.out.println("Peek : "+ q.peek());
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    
    }
}
