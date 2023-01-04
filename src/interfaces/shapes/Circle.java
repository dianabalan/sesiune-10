package interfaces.shapes;

public class Circle extends ColoredShape implements Resizable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void displayRadius() {
        System.out.println("My radius is: " + this.radius);
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void increase(double units) {
        this.radius += units;
    }

    @Override
    public void decrease(double units) {
        this.radius -= units;
    }
}
