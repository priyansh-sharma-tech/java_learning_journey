
public class ImmutableClasses {
    public static void main(String[] args) {
        College college = new College("GDC Solan", "Himachal Pradesh");
        Student s1 = new Student(28, "Priyansh Sharma", college);
           System.out.println(s1.getCollege().name); // GDC Solan 
        s1.getCollege().name = "IIT Solan"; // if we change the name of college.
           System.out.println(s1.getCollege().name);// IIT Solan.
           //therfor class is not purely immutable now, due to shallow copy of Class College.
    }
}
final class Student{ // not purely Immutable class.
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }
    // getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public College getCollege(){
        return this.college;
    }
}
class College{ // normal/mutable class.
    String name;
    String address;
    
    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}