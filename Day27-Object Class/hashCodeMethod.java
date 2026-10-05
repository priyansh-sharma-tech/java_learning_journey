import java.util.Objects;
public class hashCodeMethod {
    public static void main(String[] args) {
        // practicing hashCode Method shows boolean value.
         Student s1 = new Student();
            s1.name = "Ram Chauhan";
            s1.age = 25;
         Student s2 = new Student();
            s2.name = "Ram Chauhan";
            s2.age = 25;
         System.out.println(s1.equals(s2));// internally--> Object obj = new Strudent();
         System.out.println(s1.hashCode() == s2.hashCode());
         System.out.println(s1.hashCode());// to check s1 hashCode.
         System.out.println(s2.hashCode());// to check s2 hashCode.
    }
}
class Student{ // every class defaultly extends Object class.
    String name;
    int age;
        @Override 
        public boolean equals(Object obj){
            if(this == obj) {
                return true;
            }
            if (obj == null){
                return false;
            }
            //check if both classes are of type Student.
            if(obj.getClass() != this.getClass()){
                return false;
            }
            Student s = (Student) obj;// typecast obj to student, therefore s2 is now student's object.
            return (this.name == s.name && this.age == s.age);
        }
        @Override
        public int hashCode(){
            return Objects.hash(name, age);  // here "Objects" is another class than Object class
        }                                   //   "Objects" class java.util package me ha.
        //                                    to isko uper import krna hoga.

}