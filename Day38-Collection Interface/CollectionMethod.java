import java.util.*;
    public class CollectionMethod {
        public static void main(String[] args) {
            Collection<Integer> c = new LinkedList<>();
                c.add(1);
                c.add(2);
                c.add(3);
                c.add(4);
                                //Methods in Collections-->
                    //--> size
                System.out.println(c.size()); //--> 4
                System.out.println(c.isEmpty()); //--> false
                    //--> Boolean Contains (Object o);
                System.out.println(c.contains(4)); //--> True
                // iterate()-->Iterator
                // Object[] toArray();
                Object [] obj = c.toArray();
                    for(Object o : obj){
                        System.out.println(o);
                    }
                //Generics toArray
                Integer[] arr2 = new Integer[0];
                Integer[] arr = c.toArray(arr2);    
                    for (Integer i : arr){
                        System.out.println(i);
                    }
                // Boolean add(E e);
                boolean b = c.add(5);
                    System.out.println(b);
                // Boolean remove(Object obj)
                System.out.println(c.remove(2));
                // boolean addAll(Collection<? extends E> c)
                c.addAll(List.of(5,6,7,8));
                    System.out.println(c);
                // boolean containsAll(Collection<?>c);
                System.out.println(c.containsAll(List.of(1,2,3))); // false, because 2 is removed earlier.
                //boolean removeAll(Collection <?> c)
                c.removeAll(List.of(1,3,4));
                    System.out.println(c);
                //boolean retainAll(Collection<?>c)-->Intersection
                c.retainAll(List.of(5,6)); // 5, 6 ke alava sabhi delete kr do.
                    System.out.println(c);
                c.clear(); //remove everry thing

                

        }
    }
