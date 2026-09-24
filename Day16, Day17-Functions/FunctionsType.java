public class FunctionsType {
    public static void main(String[] args) {
        // Functions in Java (Function hamesha PSVM ke bahar banega.)
           //1st call
            greet();

            //2nd call
            sayHello("Priyansh"); // yaha pr (priyansh) ek Argument ha.
            //3rd call
            int x = getNumber(); 
            System.out.println(getNumber());
            //4th call
            multiply(12,3);
            System.out.println(multiply(12,3));



    }
        /* Type of Functions---> there are "4" type of functions.
           Type-1) No input, No output.                    */
            static void greet() { // jab bhi {no in, no op} hota ha too vha pr {Return type}--> "VOID" lagate ha.
                System.out.println("Hello");
               // return; // ye bhi optional ha.
            }
        // Type-2) Input, No Output.
            static void sayHello(String name) { // yaha input ha ---> (String name).
                System.out.println("Hello " + name);
            }
        // Type-3) No Input, Output.
            static int getNumber(){// yaha pr output ha---> {return 10;}.
                return 10;
            }
        // Type-4) Input, Output.
            static int multiply(int a, int b){// yaha pr input-->(int a, int b), or output ha--> {return (a*b)}
                return (a * b);
            }



}
