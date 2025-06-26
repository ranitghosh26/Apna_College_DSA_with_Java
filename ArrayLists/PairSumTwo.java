import java.util.ArrayList;

public class PairSumTwo {
    public static boolean PairSumTwo(ArrayList<Integer> list, int targat){
        int BreakPointer=-1;
        int n= list.size();  
        for(int i=0; i<list.size();i++ ){
            if (list.get(i)>list.get(i+1)) {
                BreakPointer=i;
                break;
            }

        }

        int LeftPointer=BreakPointer+1; // Smallest
        int RightPointer=BreakPointer;  // Largest

        while (LeftPointer!=RightPointer) {
            
            // Case 1
            if (list.get(LeftPointer)+list.get(RightPointer)==targat) {
                return true;
            }
            // Case 2
            if (list.get(LeftPointer)+list.get(RightPointer)<targat) {
                LeftPointer=(LeftPointer+1)%n;
            } else{
                RightPointer=(n+RightPointer-1)%n;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // 11,15,6,8,9,10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int targat =16;

        System.out.println("Anss : "+(PairSumTwo(list,targat)));

    }
    
} 
