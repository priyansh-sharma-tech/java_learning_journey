public class VariablesInInterfaces {
    public static void main(String[] args) {
        MathConstant r1 = new Random();
            r1.fun();
            System.out.println(MathConstant.VALUE);
    }
}
// Variables inside Interfaces--> 
interface MathConstant {
    double PI_VALUE = 3.14;// ye ek constant ha to interface me apne aap "public static final" internally lg jata ha.
    int VALUE = 10;
        void fun();
}
class Random implements MathConstant{
    public void fun(){
        System.out.println(PI_VALUE +", "+ VALUE);
    }
}