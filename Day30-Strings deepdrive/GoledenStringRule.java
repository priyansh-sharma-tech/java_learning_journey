public class GoledenStringRule {
    public static void main(String[] args) {
        String s1 = "ja" + "va";// compile-time pr ho ta ha.StringPool memory me bnega.
        String s2 = "java";
            System.out.println(s1==s2); //True--> same object ko refrence kr rhe ha
        String s3 = "ja";
        String s4 = s3 + "va"; // run-time pr ho rha ha."s3" heap memory me bnega
            System.out.println(s3==s4); // false--> alag objects ko refer kr rhe ha.
        String s5 = "java";//compile-time pr hi ho ri ha kuki assignment operator ha isme.
        String s6 = s5;
            System.out.println(s5==s6);//true --> pointing same reference in Stringpool.
        String s = "Hello";//String pool me store hoga.
               s = "World";// s ab world ko point krega.
            System.out.println(s);// World is answer.
    }
}
