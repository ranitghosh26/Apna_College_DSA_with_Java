import java.util.*;
public class Question03 {
// Reverse a stack **********   

    // Push at Bottom of the stack
    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void revarseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revarseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer>s){
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            int curr = s.pop();
            System.out.print(curr + " ");
            temp.push(curr);
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> s=  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Original Stack: ");
        printStack(s);
        revarseStack(s);
        System.out.println("Reversed Stack: ");
        printStack(s);
    
    
            
        
        
    }
    
}

