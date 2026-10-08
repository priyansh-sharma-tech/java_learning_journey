public class ResolutionPriorityRule {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}
/*
java resolution priority rule-->agar class c exteds class B and also implements interface A ,
and both "class B & interface A " has same method, 
so, priority will be given to the class method always by default.
*/
interface A {
    default void fun(){
        System.out.println("Inside interface A");
    }
}
class B {
    public void fun(){
        System.out.println("inside class B");
    }
}
class C extends B implements A {
//agar me chahta hu ki interface ka method call ho to-->
    @Override 
    public void fun(){
        A.super.fun();
    }
}