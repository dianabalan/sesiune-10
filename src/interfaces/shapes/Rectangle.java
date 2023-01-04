package interfaces.shapes;

public class Rectangle extends ColoredShape {

    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public void displayShapeInfo() {
        System.out.println("This is the info about rectangle: width= " + this.width + ", length=" + this.length);
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.width);
    }
}
