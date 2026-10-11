public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String ("Priyansh");
        String s2 = new String("Priyansh");

        // Length /Emptiness.
            System.out.println(s1.length());//8
            System.out.println(s1.isEmpty());// false--> agar sirf "spaces" hoge to bhi ye false hi hoga.
            System.out.println(s1.isBlank());//false---> agar sirf "spaces" hoge to ye true hoga.
        // Character accrss.
            System.out.println(s1.charAt(2));//"i"--> index value of the 2nd index.
            System.out.println(s1.toCharArray());// Priyansh--> char[] arr = s.toCharArray();
        // Comparison Methods.
            System.out.println(s1.equals(s2));//true--> case sensitive.
            System.out.println(s1.equalsIgnoreCase(s2)); //true--> it ignore the cases of letters.'A','a'
            System.out.println(s1.compareTo(s2));/* it performs lexicographical comparison-->
            a dictionary comparison, matlab--> "saurav" / "sairav" --> "sairav" phle aayega.
            -> this method=>gives -ve[s1<s2], 0[both equal], +ve[s1>s2] outputes dega. 
            ->s1 or s2 ki ASCII values ko add krke totals ko subtract kr dege.               */
        // Searching.
            System.out.println(s1.contains("ansh"));// true--> it is case sensative.
            System.out.println(s1.indexOf("y"));//3-->index value.
            System.out.println(s1.lastIndexOf("y"));// repeated text me last text ka index.
            System.out.println(s1.startsWith("Pr"));//true-> case sensative.
            System.out.println(s1.endsWith("sh"));//true-> case sensative.
        // Extraction / Transformation.
            System.out.println(s1.substring(1, 4));// "riy"=>isme endIndex "4"excluded hota ha.
            System.out.println(s1.toUpperCase());//PRIYANSH
            System.out.println(s1.toLowerCase());//priyansh
            System.out.println(s1.trim());//it trims only spaces from start and last, only for ASCII values.
            System.out.println(s1.strip());// same as trim(); but UNICODE friendly.
            System.out.println(s1.repeat(4));//repeats Priyansh 4 times.
            System.out.println(s1.replace('i', 'p'));//Prpyansh
            System.out.println(s1.replaceAll("ri", "uz"));// jitne bhi "ri" hoge sabhi replace ho jayge.
        // Split Method-->it splits Arrays.
            String s3 = "Ram, Raghav, Saurav, Rinku, Yash";
                String[] arr = s3.split(",");
                    for(String s : arr){
                        System.out.println(s);// sabhi names alag-alag line me aayege.
                    }
        //join method=> it is static method.
            System.out.println(String.join("-", "a", "b", "c"));//a-b-c
        // Conversion. from int--> String.
            String s4 = new String(String.valueOf(10));
                System.out.println(s4);//"10"
        // to get string's UNICODE values.
            byte[] arr1 = s1.getBytes();
                for(byte i : arr1){
                    System.out.print(i + "-");// sabki UNICODE values aayegi.
                }
        // Advance method. intern(); 
            String s5 = new String("Hey Ram");
            String s6 = s5;
            String s7 = s5.intern();// ye s5 ki value ko heap memory se String pool wali memory me copy krega.
        // Advance method. format(); it is Static method.
            String name = "Priyansh";
            int age = 28;
                System.out.println("Hello "+ name + ", your age is " + age );// but this is not readable.
                System.out.println(String.format("Hello %s, your age is %s", name, age));
    }

}
