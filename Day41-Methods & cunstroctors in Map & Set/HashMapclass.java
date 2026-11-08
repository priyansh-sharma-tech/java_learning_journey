import java.util.*;

public class HashMapclass {
    public static void main(String[] args) {
        // HashMap & LinkedHashMap--> both works same.
            // Cunstroctors
            Map<Integer, String> map = new HashMap<>();
            Map<Integer, String> map2 = new HashMap<>(100);
            Map<Integer, String> map3 = new HashMap<>(100,0.8f);
            Map<Integer, String> map4 = new HashMap<>(map3);
            Map<Integer, String> map5 = new HashMap<>(Map.of(101, "Aditya", 102, "Priyansh"));
    }
}
