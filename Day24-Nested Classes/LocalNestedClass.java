public class LocalNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}
class Outer {
    private int x = 4;
    void greet(){// is method ke ander nested local class ha.
        class Local{ // is class ko local nested class khte ha.
            void sayHello(){
                System.out.println("Hello Ram");
            }
        }
        Local local = new Local(); // local class ka object hmesha resoective orgainization ke ander hi rhega.
        local.sayHello();
    }
}