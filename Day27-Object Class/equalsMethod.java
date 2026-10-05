public class equalsMethod {
    public static void main(String[] args) {

        // practicing equals Method shows boolean value.
         Student s1 = new Student();
            s1.name = "Priyansh Sharma";
            s1.age = 23;
         Student s2 = new Student();
            s2.name = "Priyansh Sharma";
            s2.age = 23;
         System.out.println(s1.equals(s2));// internally--> Object obj = new Strudent();
         
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
}