// Indian Coins    :

// We are given an infinite supply of denominations
// [1, 2, 5, 10, 20, 50, 100, 500, 20001.
// Find min no. of coinslnotes to make change for a value V.

// v: 121                // ans = 3 (100+20+1)

// v = 590                    // ans = 4 (500+50+20+20)


import java.util.*;
public class Problem05 {
    public static void main(String[] args) {
        Integer coins[]={1, 2, 5, 10, 20, 50, 100, 500, 20001};


        Arrays.sort(coins,Comparator.reverseOrder());

        int countofcoin =0;
        int amount=590;

        LinkedList<Integer> ans = new LinkedList<>();

        for(int i=0;i<coins.length;i++){
            if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    countofcoin++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
                
            }
            

        }
        System.out.println("Ans: "+countofcoin);

            for(int i=0; i<ans.size(); i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
    }
}
