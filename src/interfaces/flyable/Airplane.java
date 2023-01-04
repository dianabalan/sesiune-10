package interfaces.flyable;

public class Airplane implements Flyable {

    private String model;
    private int maxAltitude;

    public Airplane(String model, int maxAltitude) {
        this.model = model;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void takeOff() {
        System.out.println(this.model + " has taken off.");
    }

    @Override
    public void fly() {
        System.out.println(this.model + " is flying at an altitude of: " + this.maxAltitude + " m");
    }

    @Override
    public void land() {
        System.out.println(this.model + " has landed.");
    }
}
