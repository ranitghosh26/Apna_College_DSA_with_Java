
// Valid Parentheses
// Given a string s containing just the characters
// 'C, 'Y, 'Y, and
// determine if the
// input string is valid.
// An input string is valid If
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.

import java.util.*;;
public class Question06 {
    public  static boolean isValid(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            //1. if opening bracket, push it
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            } else{ 
                if(s.isEmpty()){
                    return false; // If stack is empty and we encounter a closing bracket
                }
                if((s.peek()== '(' && ch ==')')
                    || (s.peek()=='{' && ch=='}')
                    || (s.peek()=='[' && ch==']')){
                        s.pop();
                    } else {
                        return false; // If the top of the stack does not match the closing bracket
                    }

            }

        }
        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({})[]";
        boolean result = isValid(str);
        System.out.println("Is the string valid " + result);
        
    }
    
}
