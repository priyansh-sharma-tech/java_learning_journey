import java.util.*;
public class SetandMaps {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
            set.add("Aditya");
            set.add("Rohit");
            set.add("Rohan ");
                System.out.println(set.contains("Ronit"));
        Map<Integer, String> map = new HashMap<>();
            map.put(100, "Rahul");
            map.put(101,"Aryan");
            map.put(102, "Gaurav");
            map.put(103, "Rahul");
                System.out.println(map.containsKey(101));
                System.out.println(map.get(102 ));
    }
}
