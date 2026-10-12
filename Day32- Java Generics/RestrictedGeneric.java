public class RestrictedGeneric {
    public static void main(String[] args) {
    
        Box <Integer> b1 = new Box();
            b1.value = 5;
            b1.printDouble();
    }
}
            //Bounds in generics-->
                // Upper bound.
class Box <T extends Number>{// 'Number' is parent class of all numerical classes.
    T value;
        public void printDouble(){
            System.out.println(value.doubleValue());
        }
}
// Agar me chahta hu ki meri class bas har tarah ke numbers ke sath kaam kr ske
//  or 'string', 'boolean', etc ko restrict kr de.