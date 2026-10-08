public class InterfaceDefining {
    public static void main(String[] args) {
        // To call "default Method".
            Car c = new Car();
            c.drive();
            // or
            Vehicle v = new Car();
            v.drive();
        // To call "static Method".
            Vehicle.brake();
    }
}
// Interface defining after java 8 --> "Default Method", "Static Method".
// From java 9--> "Private Method".
interface Vehicle{
    //"Default Method".
        default void drive(){// defalult keyword is used to define the method.
            System.out.println("Vehicle is driving");
            accelerate();
        }
    //"Static Method".
        static void brake(){
            System.out.println("vehicle is applying brake");
        }
    //"private Method".
        private void accelerate(){// because this is private, so interface k bhar se call ni kr skte.
            System.out.println("Vehicle is Accelerating");
        }
}
class Car implements Vehicle{
// i can also @override the drive(); method, if i want.
}

