public class Interface {
    public static void main(String[] args) {
        Car c = new electricCar();
            c.start();
            c.accelerate();
            c.brake();
    }
}
interface Car {
    void start();
    void accelerate();
    void brake();
}
class fuelCar implements Car {
    public void start(){
        System.out.println("Fuel Car started");
    }
    public void accelerate(){
        System.out.println("Fuel Car is accelerating");
    }
    public void brake(){
        System.out.println("Fuel Car is stopping");
    }   
}
class electricCar implements Car {
    public void start(){
        System.out.println("electric car is started");
    }
    public void accelerate(){
        System.out.println("electric car is accelerating");
    }
    public void brake(){
        System.out.println("electric car is stopping");
    }
}