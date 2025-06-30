// Reversal 
// Output : 6 5 4 3 2 1 

import java.util.*;

public class Question06 {
    public static void Reversal(Queue<Integer> q){
        Stack<Integer> s =new Stack<>();

        while (!q.isEmpty()){
            s.push(q.remove());
        } 

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        Reversal(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
            
        }
        System.out.println();

    }
}

