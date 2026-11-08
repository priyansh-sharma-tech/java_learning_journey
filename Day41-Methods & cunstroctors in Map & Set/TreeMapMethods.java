import java.util.*;
public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
            map.put(101, "Aditya");
            map.put(102, "Rahul");
            map.put(103, "Ramlal");
            //Navigable Map Methods.
                System.out.println(map.firstKey());
                System.out.println(map.lastKey());
                System.out.println(map.firstEntry());
                System.out.println(map.lastEntry());
                System.out.println(map.headMap(103));
                System.out.println(map.tailMap(102));
                System.out.println(map.subMap(101, 103));
            //Sorted Map methods.
                System.out.println(map.lowerKey(102 ));
                System.out.println(map.lowerEntry(102 ));
                System.out.println(map.floorKey(102 ));
                // all alternatives of treeset are here for the key and entry.

    }
}
