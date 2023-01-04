package interfaces.shapes;

public class Canvas {

    private Shape[] shapes;

    public Canvas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double totalArea() {
        double sum = 0;

        for (int i = 0; i < this.shapes.length; i++) {
            sum+=shapes[i].area();
        }

        return sum;
    }
}
