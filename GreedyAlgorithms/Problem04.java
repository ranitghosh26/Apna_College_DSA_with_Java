
// Max Length Chain of Pairs   : 

// You are given n pairs of numbers. In every pair, the first number is always smaller than the
// second number. A pair (c, d) can come after pair (a, b) if b < c.
// Find the longest chain which can be formed from a given set of pairs.
// pairs =
// (5, 24)
// (39, 60)
// (5, 28)
// (27, 40)
// (50, 90)               ans = 3



import java.util.*;
public class Problem04 {
    public static void main(String[] args) {   // O(nlogn)
        int pair[][]= {{5, 24}, {39,6}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));

        int chainLen=1;
        int chainend=pair[0][1];

        for(int i=1; i<pair.length;i++){
            if(pair[i][0]>chainend){
                chainLen++;
                chainend=pair[i][1];

            }
        }
        System.out.println("Minmun pair length : "+chainLen);
    }
    
}
