package interfaces.shapes;

public abstract class ColoredShape implements Shape {

    private String color;

    public ColoredShape(String color) {
        this.color = color;
    }
}
