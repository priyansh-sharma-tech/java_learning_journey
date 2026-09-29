public class Abstraction {
    public static void main(String[] args) {

        // HIGH LEVEL ABSTRACTION BY "abstract" keyword.
        
        car c = new fuelCar();// yha pr me direct 'car' class ka object nahi bna skta, kuki car class "abstract" ha.
            c.start(); // calling to Parent class "car"
            c.accelerate();// calling to child class "fuelCar".
            c.brake(); // calling to child class "fuelCar".
    
    }
}
abstract class car {// kuki ander "abstract methods" ha to class ko bhi "abstract" banana zaruri ha.
    void start(){
        System.out.println("car started");  
    }
    abstract void accelerate(); // here "abstract" keyword is used to only declare the method for child classes.
    abstract void brake();
}


class fuelCar extends car{ // kuki Parent class me "accelerate" or "brake" methods sirf 'declare' ha
//  to child class me hume 'define' bhi krna pdega.
    @Override // ye compulsory nhhi ha bs good practice ha, or ue batata ha ki hum is method ko alag se impliment kr re ha.
    void accelerate(){
        System.out.println("accelerate fuel car");
    }
    @Override
    void brake(){
        System.out.println("fuel car is breking");
    }
}


class electricCar extends car{
    
     @Override
    void accelerate(){
        System.out.println("accelerate electric Car");
    }
     @Override
    void brake(){
        System.out.println("Electric car is braking");
    }
}