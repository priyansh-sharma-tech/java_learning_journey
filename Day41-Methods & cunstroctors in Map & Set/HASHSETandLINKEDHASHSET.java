import java.util.*;
public class HASHSETandLINKEDHASHSET {
    public static void main(String[] args) {
        // Constructors of HashSet ,& LinkedHashSet
                Set<Integer> set = new HashSet<>(); // internal size--> 16
            // initial capacity
                Set<Integer> set2 = new HashSet<>(100);
            // capacity, Load factor--> defaults---> 16, 0.75
                Set<Integer> set3 = new HashSet<>(100, 0.8f);
            // using another collection
                Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));
        // both do'nt have their methods because they implements collection and iterable interfaces.
    }
}
