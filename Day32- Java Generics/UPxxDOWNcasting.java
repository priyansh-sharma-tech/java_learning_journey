public class UPxxDOWNcasting {
    public static void main(String[] args) {
                                              // UpCasting-->
        String s = "Hello";
        Object obj = s;
            System.out.println(obj);// Hello.
                                               // DownCasting-->
        Object obj1 = "Priyansh";
        String s1 = (String) obj1;
            System.out.println(s1);// Priyansh
                                                //DownCasting exception-->
        Object obj2 = 19;
        String s2 = (String) obj2;
            System.out.println(s2);// ClassCastException--> Run-time exception.
    }
}


