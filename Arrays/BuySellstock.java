import java.util.*;
public class BuySellstock {
    public static int BuySellstock(int Prices[]){
        int buyPrices= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<Prices.length;i++){
            if(buyPrices<Prices[i]){
                int Profit=Prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit,Profit);

            } else{
                buyPrices=Prices[i];
            }
        }
        return maxProfit;
    }





    public static void main(String[] args) {
        int Prices[]={7,1,5,3,6,4};
        System.out.println("Max Profit is: "+BuySellstock(Prices));
        
    }
    
}
