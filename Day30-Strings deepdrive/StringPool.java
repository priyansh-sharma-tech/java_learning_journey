public class StringPool {
    public static void main(String[] args) {
        String s1 = "Hello"; //literals objects
        String s2 = "Hello";
            System.out.println(s1==s2);//True-->kuki dono ek hi object ko reffer kr rhe ha.
        String s3 = new String ("Priyansh");
        String s4 = new String ("Priyansh");
            System.out.println(s3==s4);// false--> kuki dono alag-alag objects ko reffer kr rhe ha.
    }    
}
