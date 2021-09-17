package question2;

/**
 * Question 2
 * Create 2 different animal classes and
 * create an object from each one,
 * Also give them methods... make it your own!
 */

public class AnimalTester {

    public static void main(String[] args) {
        Dog dog = new Dog("Rottweiler", "Rex", 115);
        dog.Speak();
        System.out.println(dog.getBreed()+ " " + dog.getName() + " " + dog.getWeight());

        Cat cat = new Cat("Persian", "Garfield", 11);
        cat.Speak();
        System.out.println(cat.getBreed()+ " " + cat.getName() + " " + cat.getWeight());
    }

}
