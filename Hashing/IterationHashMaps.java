import java.util.*;
public class IterationHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);

        // Iterating using keySet()
        Set<String> keys = map.keySet();
        System.out.println("Iterating using keySet():" + keys);

        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + map.get(k));
        }
    }
}
