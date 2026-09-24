public class FunctionChanning {
    public static void main(String[] args) {
        
        // Channing in function---> iska concept same ha Nested ki tarah .
        function1();
        System.out.println("bye");
        // One more important topic---> Scope of variable:
        //it means ki koi bhi variable ha wo agar "{}" ke ander ha to vo sirf wha tk hi simit ha.


    }
    static void function1(){
        function2();
        System.out.println("okay");
    }
    static void function2(){
        function3();
        System.out.println("Hello");        
    }
    static void function3(){
        System.out.println("Hii");
    }

}
