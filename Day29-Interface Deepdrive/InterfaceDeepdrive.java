public class InterfaceDeepdrive {
    public static void main(String[] args) {
        Car c = new BlackThar();
            c.drive();
    }
}
interface Car{
    void drive();
}
abstract class Thar implements Car{ // if this class don't wan't to @override interface then make it abstract class.
    abstract public void drive();// adding 'public' is imp. for every defination of interface's Method.
}
class BlackThar extends Thar {
    @Override
    public void drive(){
        System.out.println("Black Thar is driving");
    }
}