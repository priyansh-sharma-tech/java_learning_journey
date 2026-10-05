public class cloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        s1.name = "Priyansh";
        s1.age = 23;
        Student s2 = (Student) s1.clone();
         System.out.println(s2.name);
         System.out.println(s2.age);
    }
}
class Student extends Object implements Cloneable {
    String name;
    int age;

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}