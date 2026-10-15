import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
    public static void main(String[] args) {
        //Invariant in Generics-->
                                // Animal animal = new Dog();
                                //     animal.eat();
                                //     animal.walk();
                                // //animal.bark(); this action can't be perform.
          //List <Dog> dog1 = new ArrayList<>();
          //List <Animal> animals1 = dog1; this is not allowed.
                                Dog[] dog2 = new Dog[10];
                                Animal[] animals2 = dog2;
                                animals2[0] = new Animal();
                                    for (Animal animal : animals2){ // for every Animal animal in animals2
                                        animal.eat();
                                    } // this is also not allowed.
    }
}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
