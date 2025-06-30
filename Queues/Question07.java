// Deque ::::
// Double ended queue
// Output : 
// Deque : [2, 1, 3, 4]
// Remove First: [1, 3, 4]
// Remove Last: [1, 3]
// First el = 1
// Last el = 3

import java.util.*;
public class Question07 {
    
    
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        
        System.out.println("Deque : "+deque);
        deque.removeFirst();
        System.out.println("Remove First: "+deque);
        deque.removeLast();
        System.out.println("Remove Last: "+deque);
        
        System.out.println("First el = "+ deque.getFirst());
        System.out.println("Last el = "+ deque.getLast());
    
    }
}
