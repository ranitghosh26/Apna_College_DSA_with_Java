// 12.1 




public class HollowRectangtPattern {
    public static void  hollow_rectange(int totRows,int totCols){
        for(int i=1;i<=totCols;i++){
            for(int j=1;j<=totRows;j++){
                if (i==1||i==totCols||j==1||j==totRows) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        hollow_rectange(4,5);
    }
}
