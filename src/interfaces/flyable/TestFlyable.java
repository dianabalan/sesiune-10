package interfaces.flyable;

public class TestFlyable {

    public static void main(String[] args) {
        Flyable airplane = new Airplane("boeing", 8000);
        Flyable bird = new Bird("pidgeon", 20);

        airplane.takeOff();
        airplane.fly();
        airplane.land();

        bird.takeOff();
        bird.fly();
        bird.land();
    }
}
