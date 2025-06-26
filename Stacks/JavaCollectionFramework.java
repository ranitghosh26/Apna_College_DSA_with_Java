import java.util.*;
public class JavaCollectionFramework {
    public static void main(String[] args) {
         // Stack s=  new stack();
// Using Java's built-in Stack class
            Stack<Integer> s= new  Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
    }
    
}
