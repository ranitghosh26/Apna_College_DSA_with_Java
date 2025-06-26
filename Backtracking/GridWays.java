// GridWays
// Find the number of ways to reach from (0,0) to (n-1,n-1) in a NxN grid.
// Allowed moves - right or down.

public class GridWays { 
    public static int GridWays(int i,int j, int m, int n){
        // Base case
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        
        // Recursive case
        int down = GridWays(i+1, j, m, n);
        int right = GridWays(i, j+1, m, n);
        
        return down + right;
    }

    public static void main(String[] args) {
        int n = 3 , m = 3 ; // Change the value of n to your desired board size
        System.out.println("GridWays : "+(GridWays(0,0,m,n)));
    }
    
}
