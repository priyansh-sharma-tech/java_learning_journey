public class Autoboxing {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
            System.out.println(x==y);// Ans--> true.

        Integer a = 200;
        Integer b = 200;
            System.out.println(a==b);// Ans--> false.(hum values ko nahi balki x,y refrence ke address ko compare kr rhe ha).
            // Agar muj values ko compare krna ha to muj asa krna hoga-->
            System.out.println(a.intValue()== b.intValue());// true.
            // or me ya bhi krr skta hu.
            System.out.println(a.equals(b)); // true.
        Integer p = 100;
        Integer q = 100;
            System.out.println(p==q);
    }
}
