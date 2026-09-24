public class RecursionFunction {
    public static void main(String[] args) {
        // Recursion in function--->
        
        int n = 98;
        printNum(n);

    }
        static void printNum(int n) {
            if (n==0) return; 
            printNum(n-1); // Recursive call
            System.out.print(n+", ");
        }

        
        
       


    

}
