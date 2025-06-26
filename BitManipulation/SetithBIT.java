// package BitManipulation;

public class SetithBIT {
    public static int SetithBIT(int n, int i) {
        int bitmask = 1 << i; 
        return n | bitmask; 
    }

    public static void main(String[] args) {
        System.out.println("Ans : " + SetithBIT(10, 2));
    }
}
