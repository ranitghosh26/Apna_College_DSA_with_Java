// package BitManipulation;

public class ClearIthBIT {

    public static int ClearithBIT(int n,int i)
{
    int bitmask=  ~(1<<i);
    return n & bitmask;
}

    public static void main(String[] args) {
        System.out.println("Ans : " + ClearithBIT(10, 1));
    }
    
}
