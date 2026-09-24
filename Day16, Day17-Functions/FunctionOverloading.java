public class FunctionOverloading {
    public static void main(String[] args) {
        // Function Overloading:
        int x = sum (3, 5);
        System.out.println(x); // hum normaly functin ko is tarah se use krte ha .

        // ab me agar 3 digits ko add kru to me niche function add kr skta ha
        int y = sum(3444, 432, 333);
        System.out.println(y);
        int p = sum( 23.3, 34);
        System.out.println(p);
        
    }
        static int sum(int a, int b){
            return(a + b);
        }
        // ab agar muj 3 values ko add krna ha to me asa krk skta hu.
        static int sum(int a, int b, int c) {// kuki beshak sum same ha pr Arguments to alag ha.
            return (a - b - c);
        }
        // or me different type of parameters bhi rakh sakta hu.
        static int sum(double r, double s){
            return (int)(r + s);
        }














}
