public class GenericMethods {
    public static void main(String[] args) {
        Integer y = getResult(5);
            System.out.println(y);
        String s = getResult("Priyansh");
            System.out.println(s);
        printPair(true, "Priyanshu"); // here is type inference.
    }
    public static <T> T getResult(T v){    //<T> TYPE PARAMETER.
        return v;
    }
    public static <T, U> void printPair(T first, U second){
        System.out.println(first + ", " + second);
    }
}
