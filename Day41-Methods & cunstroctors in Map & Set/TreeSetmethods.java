import java.util.*;

public class TreeSetmethods {
    public static void main(String[] args) {
        // Cunstroctors of TreeSet
            //Set<Integer> set2 = new TreeSet<>(List.of(2,5,7,9));
            TreeSet<Integer> set = new TreeSet<>();
                set.add(80 );
                set.add(23 );
                set.add(10 );
                set.add(90 );
                set.add(50 );
        // Sorted Set Interface's Methods
            System.out.println(set.first()); // to get the smallest value.--> 10
            System.out.println(set.last()); // to get the largest value.--> 90
            System.out.println(set.headSet(80 )); // it gives the smaller no's than 80, 80 is excluded.
            System.out.println(set.tailSet(80));// it gives the 80 and larger then 80.
            System.out.println(set.subSet(23, 80));//23 is inclusive & 80 is exclusive.
        // Navigable Set extends Sorted Set methods
            System.out.println(set.lower(80));// gives largest no lower than 80.
            System.out.println(set.floor(80));// gives greatest element less then or equal to 80.
            System.out.println(set.higher(80));// smallest no greater than 80.
            System.out.println(set.ceiling(80 ));// smallest no greater than or equal to 80.
            // System.out.println(set.pollFirst());// it gives & removes the smallest no.
            // System.out.println(set.pollLast());// it gives & removes the largest no.
            System.out.println(set.descendingSet());
            Iterator<Integer> it = set.descendingIterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
            System.out.println(set.headSet(80, true));// to include 80.
            System.out.println(set.tailSet(80, false));// to exclude 80.
            System.out.println(set.subSet(10, false, 80, true));

        
    }
}
