public class BinaryStr {

    public static void BinaryStr(int n,int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // logic
        // 0 can be added in the string
        BinaryStr(n - 1,0,  str+"0");
        // 1 can be added in the string only if last character is not 1
        if (lastPlace == 0) {
            BinaryStr(n - 1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        BinaryStr(3, 0, "");
        
    }
    
}
