
import java.util.*;

public class LAMBDAexpressionnn {
    public static void main(String[] args) {
        List <Student> list = new ArrayList<>();
            list.add(new Student("Aryan", 01, 93));
            list.add(new Student("Priyansh", 02, 96));
            list.add(new Student("Tanuja", 03, 83));
            list.add(new Student("Raghvindra", 04, 94));
               Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
               for(Student s : list ){
                System.out.println(s.name + ", " + s.rollNo + ", " + s.marks);
               }
    }
    
}
class Student{
    String name;
    int rollNo;
    int marks;
        public Student(String name, int rollNo, int marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }
}
