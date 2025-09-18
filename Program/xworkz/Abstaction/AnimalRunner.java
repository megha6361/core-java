package xworkz.Abstaction;

public class AnimalRunner {
    public static void main(String[] args) {
        // Animal implementations
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();


    }
}
