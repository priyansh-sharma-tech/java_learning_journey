public class DiamondProblemInterface {
    public static void main(String[] args) {
        D d = new D();
        d.fun();

    }
}
interface A { 
    void fun();
}
interface B extends A {
    default void fun(){
        System.out.println("B interface.");
    }
}
interface C extends A {
    default void fun(){
        System.out.println("C interface.");
    }
}
class D implements B, C {
    @Override // kuki B, C dono interfaces ke method defined ha to yha @override krna hi pdega.
        public void fun(){
            System.out.println("class D.");
            // now if i want to call fun method of B, C then-->
            B.super.fun();
            C.super.fun();
        }
}
