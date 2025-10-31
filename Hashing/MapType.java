import java.util.*;
public class MapType {
    public static void main(String[] args) {
        // LinkedHashMap Implementation
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        System.out.println("LinkedHashMap: " + lhm);

        // HashMap Implementation
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println("HashMap: " + hm);

        // TreeMap Implementation
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        System.out.println("TreeMap: " + tm);



    }
}
