public class constructorOverloadMethods {
    public static void main(String[] args) {
        String s1 = new String();// Empty string.
        String s2 = new String(""); // also same empty String.
            System.out.println(s1);         System.out.println(s2);
        String s3 = new String("Hello");//ye heap me store hoga, or iski ek copy String pool me hogi.
            System.out.println(s3);
                                          // Char Array--->
        char[] arr = {'A', 'd', 'i', 't', 'y', 'a',};
        String s6 = new String(arr); // to print all array.
            System.out.println(s6);//ans-->Aditya.
                
                                           //char Array Subset--->
        // offset-->Array ki place value, 1st array block is always at 0th place.
        // count-->counting, always starts from 1, 2, 3....
        String s7 = new String(arr, 0, 4);//Ans--> Adit-> from 0th array aount 4 digits.
            System.out.println(s7);
                                            // byte Array subset-->
        byte[] arr2 = {94, 95, 96, 97};
        String s8 = new String(arr2, 3, 1);
            System.out.println(s8);
                                            //StringBuilder-->
        StringBuilder sb = new StringBuilder("Hello");
        String s9 = new String (sb);
        System.out.println(s9);
                                            // StringBuffer-->
        StringBuffer sbf = new StringBuffer("bye yr");
        String s10 = new String(sbf);
            System.out.println(s10);
    }
}
