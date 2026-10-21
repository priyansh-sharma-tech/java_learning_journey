import java.util.*;
public class IterablesIntro {
    public static void main(String[] args) {
        Collection <Integer> list = new HashSet<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
                Iterator <Integer> it = list.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
    }
}
// 'list.iterator();' this method is in List interface.
// Iterator<Integer> ka use isliy kr re ha taki 'hasNext()', 'next()'. mil sake.