// import java.util.*;
// public class Question07 {
//     // Duplicate Parentheses
//     // Given a string s containing just the characters '(', ')', '{', '}', '['

//     public static boolean  isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();
        
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
            
//             // If we encounter a closing bracket
//             if(ch ==')'){
//                 int count =0;
//                 while (s.peek() != '(') {
//                     s.pop();
//                     count++;
                    
//                 }
//                 if (count<1) {
//                     return true; // Duplicate parentheses found
                    
//                 } else {
//                     s.pop(); // Pop the opening bracket
//                 }
//                 else {
//                     s.push(ch); // Push the closing bracket onto the stack
//                 }
//             }
//             return false;
//         }
        
//         // If there are still elements in the stack, it means there are unmatched opening brackets
    
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s= new Stack<>();
//         String str = "((a+b))";
//         String str2 = "(a-b)";
//         System.out.println("Is the string \"" + str + "\" has duplicate parentheses? " + isDuplicate(str));
//     }
    
// }




import java.util.*;
public class Question07 {
    // Duplicate Parentheses
    // Given a string s containing just the characters '(', ')', '{', '}', '['

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If we encounter a closing bracket
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (!s.isEmpty()) {
                    if (count < 1) {
                        return true; // Duplicate parentheses found
                    } else {
                        s.pop(); // Pop the opening bracket
                    }
                }
            } else {
                s.push(ch); // Push all other characters (including opening bracket)
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println("Is the string \"" + str + "\" has duplicate parentheses... " + isDuplicate(str));
        System.out.println("Is the string \"" + str2 + "\" has duplicate parentheses... " + isDuplicate(str2));
    }
}