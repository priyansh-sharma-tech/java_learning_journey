public class toStringMethod {
    public static void main(String[] args) {

        //Practicing toString method--->
        Student s1 = new Student();
        s1.name = "Priyansh";
        s1.age = 24;
        System.out.println(s1.toString());// agr me sirf println(s1) bhi likhu tb bhi ye call ho jayga.
        System.out.println(s1); // both means same. result will be same.
    }
}
class Student{ // every class defaultly extends Object class.
    String name;
    int age;
        @Override 
        public String toString(){
            return (name + ", " + age);
        }
}