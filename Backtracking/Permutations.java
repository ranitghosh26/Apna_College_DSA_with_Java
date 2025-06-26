public class Permutations {
    public static void Permutations(String str, String ans){
        //Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursive case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            String left_substr = str.substring(0, i); // Get the substring before the character
            String right_substr = str.substring(i + 1); // Get the substring after the character
            String str1 = left_substr + right_substr; // Concatenate the left and right substrings
            Permutations(str1, ans + ch); // Recursive call with the remaining string and updated answer
        }
    }
    public static void findPermutations(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }  
    
    public static void main(String[] args) {
        String str = "abc";
        Permutations(str, ""); // Start with an empty answer

    }
}
