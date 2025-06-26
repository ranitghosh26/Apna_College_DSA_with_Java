import java.util.ArrayList;

public class Classroom{
    public static void main(String[] args) {
        ArrayList<Integer> List= new ArrayList<>();
        ArrayList<String> List2= new ArrayList<>();
        ArrayList<Boolean> List3= new ArrayList<>();

        // Add Elements  O(1)

        List.add(1);
        List.add(2);
        List.add(3);

        List.add(1,9);

        System.out.println("List of Integers: " + List);

        //Get Element O(1)

        // int Element= List.get(1);
        // System.out.println("Element at index: " + Element);
        
        //Remove Element O(n)
        // List.remove(2 );

        //Set Element at Index O(n)

        // List.set(2, 10);
        // System.out.println("Element set at index 2: " + List);

        // Contains Element O(n)
        // System.out.println(List.contains(1));
        // System.out.println(List.contains(11));
    }

}