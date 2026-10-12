public class ProblemBeforeGeneric {
    public static void main(String[] args) {
        Box b1 = new Box (10);
        Box b2 = new Box ("Hello");
        Box b3 = new Box (true);
            System.out.println(b1.getValue());// ans->10
            //System.out.println(b1.getValue() + 5);// error--> not sure.
                        // so we have to do--> DownCasting..
        Integer x = (Integer) b1.getValue();
        String s = (String) b2.getValue();
        Boolean b = (Boolean) b3.getValue();
            System.out.println(x + 5);
            System.out.println(s + 5);
            System.out.println(b);
            
    }
}
class Box {
    private Object value;
        Box(Object value) {
            this.value = value;
                //System.out.println(this.value);// constructor dalte hi print ho jaye.
        }
        public Object getValue(){
                //System.out.println(this.value);// main function me print statement na likhni pde.
            return this.value;     
        }
        public void setValue(Object value){
            this.value = value;
        }
}
