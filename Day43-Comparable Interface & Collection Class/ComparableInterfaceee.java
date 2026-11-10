import java.util.*;

public class ComparableInterfaceee {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
            list2.add(10);
            list2.add(34);
            list2.add(3);
            list2.add(24 );
                Collections.sort(list2);
                System.out.println(list2);// Ans--> [3, 10, 24, 34]
        // but here i can't do this.
        List<Student> list = new ArrayList<>();
            list.add(new Student("Priyansh", 95));
            list.add(new Student("Rahul", 85));
            list.add(new Student("Raghav", 92));
            list.add(new Student("Arvind", 85 ));
                Collections.sort(list);//asscending order. I am not able to perform this action.
        // so, i have to implement the comparable interface below-->
                for(Student s : list){
                    System.out.println(s.name + ", " + s.marks);
                }
    }
}
class Student implements Comparable<Student>{
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    // @Override 
    //     public int compareTo(Student other){
    //         return this.marks - other.marks;// for Asscending order Comparison.
    //         //return other.marks - this.marks; // for descending order Comparison.
    //     }
    //Lexicographical order comparison-->
    @Override 
        public int compareTo(Student other){
            if(this.marks != other.marks){
                return this.marks - other.marks;
            }
            return this.name.compareTo(other.name);
        }
}