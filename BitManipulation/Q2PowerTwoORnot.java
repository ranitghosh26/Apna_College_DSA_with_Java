public class Q2PowerTwoORnot {

    public static boolean Q2PowerTwoORnot(int n){
        return (n & (n-1)) ==0;
    }
    public static void main(String[] args) {
       System.out.println("Ans : " + Q2PowerTwoORnot(15)); 
    }
    
}
