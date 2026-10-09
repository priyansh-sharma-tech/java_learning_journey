public class StringImmutable {
    public static void main(String[] args) {
        // String immutabilty check.
        String s1 = "Hello";
        s1.concat(" world");// too concat->string ke piche string lagana ke liye ha prr...
            System.out.println(s1); //Result-->Hello-->ye concat string me possible nahi ha, 
            // kuki string immutablle class ha , 
            // orr "Hello world" alag object bn gya ha jo abhi khi point nahi ha.
    }
}
