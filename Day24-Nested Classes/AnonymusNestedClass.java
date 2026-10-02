public class AnonymusNestedClass {
    public static void main(String[] args) {
        Person p1 = new Person(){ // this is a anonymous class with no name.
            @Override 
            void introduce(){
                greet(); // muj greet yhi call krna hoga .
                System.out.println("Hii i am Priyansh");
            }
            void greet(){
                System.out.println("Hello"); // me bahar greet call nhi kr skta.
            }
        };
        p1.introduce();
       ;     
    }
}
class Person {
    void introduce(){
        System.out.println("HI I am a guest");
    }
}