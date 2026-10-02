public class staticNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer(); // to access outer class
        Outer.Inner inner = new Outer.Inner();// to access the nested innerr class.
        inner.fun();// me inner nested class ki function ko call kr dega.
    }
}
class Outer{
    static class Inner{ //ye nested class static ha to isko access krne k lia hum outer class ke object ki zarurat nahi ha.
        void fun(){
            System.out.println("Hello");
        }
    }
}