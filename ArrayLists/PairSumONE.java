import java.util.ArrayList;
public class PairSumONE {
    public static boolean PairSumONE(ArrayList<Integer> list, int targat){

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==targat){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targat=5;
        System.out.println(PairSumONE(list,targat));

    }
}
