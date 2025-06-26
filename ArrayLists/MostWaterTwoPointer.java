import java.util.ArrayList;
public class MostWaterTwoPointer {
    public static int MostWaterTwoPointer(ArrayList<Integer> height){
    
        int maxWater=0;
        int LeftPointer=0;
        int RightPointer=height.size()-1;;

        while (LeftPointer < RightPointer) {
            // calculate water area
            int ht= Math.min(height.get(LeftPointer), height.get(RightPointer));
            int width=RightPointer-LeftPointer;
            int currWater=ht*width;
            maxWater=Math.max(maxWater, currWater);
            // update ptr
            if (height.get(LeftPointer)<height.get(RightPointer)) {
                LeftPointer++;
            } else{
                RightPointer--;
            }


        }
        return maxWater;

    }
    
    public static void main(String[] args) {
        ArrayList<Integer>height= new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(" => "+(height)); 
    }
}
