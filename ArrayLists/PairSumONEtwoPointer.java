import java.util.ArrayList;
public class PairSumONEtwoPointer {

    public static boolean PairSumONEtwoPointer(ArrayList<Integer> list, int targat){
        int LeftPointer=0;
        int RightPointer=list.size()-1;

        while (LeftPointer!=RightPointer) {
            // Case 1
            if (list.get(LeftPointer)+list.get(RightPointer)==targat) {
                return true;
            }
            // Case 2
            if (list.get(LeftPointer)+list.get(RightPointer)<targat) {
                LeftPointer++;
            } else{
                RightPointer--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targat =50;

        System.out.println("Anss : "+(PairSumONEtwoPointer(list,targat)));

    }
    
}
