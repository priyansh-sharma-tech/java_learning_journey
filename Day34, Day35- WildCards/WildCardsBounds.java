import java.util.ArrayList;
import java.util.List;

public class WildCardsBounds {
    public static void main(String[] args) {
        // WildCard with "upper bound"---> "? extends"
            List <Dog> dogs =  new ArrayList<>();
                dogs.add(new Dog());
                dogs.add(new Dog());
                    fun(dogs);//--> Dog is Eating, Dog is Eating
            List <Animal> animals = new ArrayList<>();
                animals.add(new Animal());
                animals.add(new Animal());
                    fun(animals);//--> Animal is Eating, Animal is Eating
        // WildCard with "Lower Bound"---> "? super"
                List <Animal> animals2 = new ArrayList<>();
                    animals2.add(new Animal());
                    animals2.add(new Animal());
                        fun2(animals2);

    }
    // WildCard with "upper bound"-->(extends).
        static void fun(List <? extends Animal> values){
            for(Animal a : values) {
                a.eat();
            }
        }
    // WildCard with" <? super>
        static void fun2(List <? super Animal> values){
            values.add(new Animal());
            values.add(new Dog());
            values.add(new Cat());
                for(Object obj : values) {
                    Animal a = (Animal) obj;
                        a.walk();
                }

        }
}
class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}
class Dog extends Animal{
   
    @Override
    void eat() {
        System.out.println("Dog is Eating");
    }
     void bark() {
        System.out.println("Barking");
    }
}
class Cat extends Animal{

}