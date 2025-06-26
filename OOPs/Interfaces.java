public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}
interface Herbivore {

    
}
interface Carnivore {

    
}
class Bear implements Herbivore, Carnivore {

    
}
interface ChessPlayer{
   void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up , Down  , left , right , diagonal ( in all 4 dirrns )...");

    }

} 
class Root implements ChessPlayer{
    public void moves(){
        System.out.println("Up , Down  , left , right ...");

    }

} 
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up , Down  , left , right , diagonal ( by 1 Step )...");

    }

} 

