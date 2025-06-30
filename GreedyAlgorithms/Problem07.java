
// Chocola Problem
// We are given a bar of chocolate composed of mxn square pieces. One should break the chocolate
// into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive
// integer. This cost does not depend on the size of the part that is being broken but only depends on
// the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines
// with xl, x2, ..., xm-l and along horizontal lines with YI, Y2,...,yn-l.
// Compute the minimal cost of breaking the whole chocolate into single squares.


import java.util.*;
public class Problem07 {
    public static void main(String[] args) {
        int n=4, m=6;
        Integer CostVar[]={2, 1,3,1,4};
        Integer CostHor[]={4,1,2};


        Arrays.sort(CostVar,Collections.reverseOrder());
        Arrays.sort(CostHor,Collections.reverseOrder());
        

        int h=0, v=0;
        int hp=0, vp=0;
        int cost=0;


        while (h<CostHor.length && v<CostVar.length) {
            if(CostVar[v]<=CostHor[h]){
                cost+=(CostHor[h]*vp);
                hp++;
                h++;
            } else{
                cost+=(CostVar[v]*hp);
                vp++;
                v++;
            }
            
        }
        while (h<CostHor.length) {
            cost+=(CostHor[h]*vp);
            hp++;
            h++;            
        }
        while (v<CostVar.length) {
            cost+=(CostVar[v]*hp);
            vp++;
            v++;
            
        }
        System.out.println("Mimimum cost : "+ cost);
    }
}
