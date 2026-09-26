

public class ChanningOfConstructor {
    public static void main(String[] args) {
        //Channing of Constructor.

        Student s1 = new Student();
        Student s2 = new Student("Aditya");
        Student s3 = new Student("Sunita", 23);
        Student s4 = new Student("Raghac", 24, 2);
        Student s5 = new Student("Gaurav", 23, 3, "Degree college Soan ");

            
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){}

    Student(String name){
        this.name = name;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age; 
        this.rollNumber = rollNumber;
        this.college = college;
    }
     // Channing of the above Methods----> and replace all instance methods variables by--->
    // all cunstroctors are calling to the last cunstroctor:
    Student(){
    this("unknown", 0, 0, "unknown");
    }
    Student(String name){
        this(name, 0, 0, "unknown");
    }
    Student(String name, int age){
       this(name, age, 0, "unknown");
    }
    Student(String name, int age, int rollNumber){
        this(name, age, rollNumber, "unknown");
    }
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age; 
        this.rollNumber = rollNumber;
        this.college = college;
    }


}
    
