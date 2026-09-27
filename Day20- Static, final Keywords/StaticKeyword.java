public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student ("Mehak", 19, 01);
        Student s2 = new Student ("Priyansh", 21, 02);
    
        Student.college = "IIT Solan"; // isko me "static block" me assign kr skta hu.

        System.out.println(s1.name + ", " + s1.age + ", " + s1.rollNumber + ", " + Student.college);
        System.out.println(s2.name + ", " + s2.age + ", " + s2.rollNumber + ", " + Student.college);
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    static String college;// Static ka matlab ha ki ab ye wali string ---> class string ha.
    //static String college = "IIT Solan"; // "static block ki jagah me yaha bhi direct lik sakta hu."
    Student(String name, int age, int rollNumber){
        this.name =name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    // Static Block
    static{
        college = "IIT Solan";
    }
}