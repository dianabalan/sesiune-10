package interfaces.object_polymorphism;

public class AnimalTest {

    public static void main(String[] args) {
        Animal cat = new Cat();

        Animal dog = new Dog();

        cat = dog;

        cat.makeNoise();
    }
}
