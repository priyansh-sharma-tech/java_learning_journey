public class Constructor {
    public static void main(String[] args) {
        //Cunstructor 
        Student s1 = new Student("Rocky", 19, 102, "Solan");
            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.rollNumber);
            System.out.println(s1.college);

    }
}
class Student { // public class ke bahar bani ha.
    String name ;
    int age; 
    int rollNumber;
    String college;
// constructor method / functions below.
    Student(){ // same name as class. Taki details khali hone pr cunstrocter ki details print ho.
        name = "Priyansh";
        age = 19;
        rollNumber = 1;
        college = "G.D.C Solan";
    }
// Parameterized Constructor: it simpaly means ki hum parameters de rhe ha, uske hisab se details print kro.
    Student(String name, int age, int rollNumber, String college){
        this.name = name; // "this." is used to denote class instance variables
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college; 
    }// or ab hume khali method cll nahi kr skte kuki ab hume parameters assign krne hi pdege.
    //  jab tak hum default parameter add krke cunstroctor overloading na kr le.
   

}