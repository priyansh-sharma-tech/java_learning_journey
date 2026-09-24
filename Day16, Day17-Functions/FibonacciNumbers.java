public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci sequence upto " + n + ":");

        for(int i = 1; i<= n; i++){
            System.out.print(fibonacci(i) + ", ");
        }
            
    }

        static int fibonacci (int n){
            if(n<=1){
                return n;
            }
            return (fibonacci(n-1) + fibonacci (n-2));
        }
}
