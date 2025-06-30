
// Fractional Knapsack : 

// Given the weights and values of N items, put these items in a knapsack of
// capacity W to get the maximum total value in the knapsack.
// value = [60, 100, 1201
// weight [10, 20, 301                 ans 240
// w: 50


import java.util.*;
public class Problem02 {
    public static void main(String[] args) {
        int val[] = {60, 100, 1201};
        int weight[] ={10, 20, 301};                 
        int w= 50;

        // racio 
        double racio [][]=new double[val.length][2];

        for(int i=0; i<val.length; i++){
            racio[i][0]=i;
            racio[i][1]=val[i]/(double)weight[i];
        }

        // as

        Arrays.sort(racio,Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int finalValue=0;

        for(int i =racio.length-1;i>=0;i--){
            int indx=(int)racio[i][0];
            if (capacity>=weight[indx]) {
                
                finalValue+=val[indx];
                capacity-=weight[indx];
            } else{
                finalValue += (racio[i][1]*capacity);
                capacity=0;
                break;

            }
        }
        System.out.println(" Final Value : "+ finalValue);

    }
    
}
