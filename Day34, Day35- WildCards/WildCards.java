import java.util.List;
import java.util.ArrayList;
    public class WildCards {
        public static void main(String[] args) {
            // Without WILDCARD.
                        // List <Dog> dogs = new ArrayList<>();
                        //     dogs.add(new Dog());
                        //     dogs.add(new Dog());
                        //    fun(dogs);// not possible kuki me dogs ki list Animals ki list
                                       //  me pass nahi kr skta.
                        // List <Animal> animals = new ArrayList<>();
                        //     animals.add(new Animal());
                        //     animals.add(new Animal());
                        //         fun(animals);// this is possible and Eating/Eating is answer.
            // With WILDCARD.
            List<Animal> animals = new ArrayList<>();
                animals.add(new Animal());
                animals.add(new Animal());
                    fun(animals);// ANS--> 2-times-->"Animal"
            List<Dog> dogs = new ArrayList<>();// now this is possible with WILDCARD.
                dogs.add(new Dog());
                dogs.add(new Dog());
                    fun(dogs);// ANS--> 2-times-->"Dog"
        }
        // Without WILDCARD.
                        // static void fun(List<Animal> animals){ 
                        //     for(Animal animal : animals) {
                        //         animal.eat();
                        //     }
                        // }
        // with WILDCARD.
        static void fun(List<?> values) {
            for (Object obj : values) {
                System.out.println(obj.getClass().getName());
            }
        }
    }
    class Animal{
        void eat() {
            System.out.println("Eating");
        }
        void walk() {
            System.out.println("Walking");
        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }
