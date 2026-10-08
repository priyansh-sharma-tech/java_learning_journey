public class InterfaceInheritance {
    public static void main(String[] args) {
        
    }
}
 // interface inheritance.
interface Animal{
    void eat();
}
interface Dog extends Animal{
    void bark();
}
class StreetDog implements Dog{
    @Override 
        public void eat(){
            System.out.println("eating");
        }
    @Override 
        public void bark(){
            System.out.println("barking");
        }
}