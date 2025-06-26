import java.util.*;
public class Question02 {
    // Reverse a String using Stack (not recursion)
    public static String ReverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder reverse = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            reverse.append(curr);
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = ReverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
