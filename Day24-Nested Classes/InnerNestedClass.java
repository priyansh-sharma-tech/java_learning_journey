public class InnerNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer(); // outer class ka object simple hi bnega.
        Outer.Inner inner = outer.new Inner();// yaha pr nested class k lia 
        //                                      "new" se phle hume "outer" referance likhna zaruri ha.
        inner.fun();
    }
}
class Outer{
    int x =10;
    class Inner{ // is class me static nahi ha to ye outer class ke object pr depend krti ha.
        int x = 20;
        void fun(){
            System.out.println(x);
            System.out.println(Outer.this.x); //to call outer class variable.
        }
    }
}