package interfaces.flyable;

public class Bird implements Flyable {

    private String species;
    private double wingSpan;

    public Bird(String species, double wingSpan) {
        this.species = species;
        this.wingSpan = wingSpan;
    }

    @Override
    public void takeOff() {
        System.out.println(this.species + " has taken off.");
    }

    @Override
    public void fly() {
        System.out.println(this.species + " is flying with wing span of "+this.wingSpan);
    }

    @Override
    public void land() {
        System.out.println(this.species+ " has landed.");
    }
}
