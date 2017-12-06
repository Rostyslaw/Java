import Samles.Cat;
import Samles.Dog;
import Samles.Animal;

public class MyClass {
    int c = 4;

    public static void main(String[] args) {
        double g = 4.44;
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound(4);

    }
}