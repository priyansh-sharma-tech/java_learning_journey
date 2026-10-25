import java.util.*;
public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
                System.out.println(list.get(2));
                list.set(2, 7);
                    System.out.println(list);
                list.addAll(1, List.of(8,4,54));
                    System.out.println(list);
                list.remove(2);
                    System.out.println(list);
                System.out.println(list.indexOf(7 ));
                System.out.println(list.lastIndexOf(5 ));
                ListIterator<Integer> it = list.listIterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
                // ListIterator<Integer> it2 = list.listIterator(5);
                //     while(it.hasPrevious()) {
                //         System.out.println(it2.previous());
                //     }
                List<Integer> l = List.of(1,2,3,4,5,6,7,8); // this method is immutable.
                    System.out.println(l );
                List<Integer> l2 = List.copyOf(l);// this list is also immutable because it copied immutable list.
                    System.out.println(l2);
    }
}
