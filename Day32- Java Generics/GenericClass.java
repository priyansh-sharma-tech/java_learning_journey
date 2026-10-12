public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(10);// type Argument.
        Box<String> b2 = new Box<>("Hello ");
        Box<Boolean> b3 = new Box<> (false);
            System.out.println(b1.getValue() + 5);
            System.out.println(b2.getValue() + 5);
            System.out.println(b3.getValue());
    }
}
// Generic ---->
class Box <T> { //Type parameter...
    private T value;
        Box(T value) {
            this.value = value;
                //System.out.println(this.value);// constructor dalte hi print ho jaye.
        }
        public T getValue(){
                //System.out.println(this.value);// main function me print statement na likhni pde.
            return this.value;     
        }
        public void setValue(T value){
            this.value = value;
        }
}