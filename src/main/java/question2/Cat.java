package question2;

public class Cat {

    String breed;
    String name;
    int weight;

    public Cat(String breed, String name, int weight) {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }

    public void Speak() {
        System.out.println("Meow!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}


