public class OOPintroduction {
    public static void main(String[] args) {
        
        Student s1 = new Student();// 
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.age = 18;
        s1.rollnumber = 100;
        s1.college = "G.D.C.Solan";

        s2.name = "Ansh";
        s2.age = 19;
        s2.rollnumber = 101;
        s2.college = "G.D.C.Solan";


        s1.markAttendence();
        s1.print();
        s2.markAttendence();
        s2.print();


    }
}

class Student{//class is the blueprint of the data.
    String name; // these all are the characterstics of data / object.
    int age;   // these are known as INSTANCE VARIABLES.
    int rollnumber;
    String college;

     // these objects are known as INSTANCE METHODS.
    void markAttendence() { //these all are the behaviour of the data / object.
        System.out.println ("Attendence marked by " + name);
    }
    void print(){
        System.out.println("Name = " + name +", "+ "Age = "+ age+", "+ "Roll Number = "+ rollnumber+", " + "College Name = "+ college);
    }


}