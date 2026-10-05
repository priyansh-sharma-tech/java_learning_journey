public class getClass {
    public static void main(String[] args) {
        //practicing getClass Method
        Animal a = new Animal();
        Animal d = new Dog();
            System.out.println(a.getClass().getName());// Ans-->Animal. Runtime class animal ha.
            System.out.println(d.getClass().getName());// Ans-->Dog. Runtime class Dog ha.
        //Practicing "instance Operator"--> if an object is "instance" of class or any oof its sub-class.
            System.out.println(a instanceof Object);
            System.out.println(a instanceof Animal);
            System.out.println(a instanceof Dog);
            System.out.println(d instanceof Animal);
    }
}
class Animal{

}
class Dog extends Animal{

}