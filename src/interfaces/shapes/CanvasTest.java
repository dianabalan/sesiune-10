package interfaces.shapes;

public class CanvasTest {

    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle("red", 10, 20);
        Shape rectangle2 = new Rectangle("blue", 1, 2);

        Shape circle = new Circle("pink", 10);

        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = rectangle1;
        shapeArray[1] = rectangle2;
        shapeArray[2] = circle;

        Canvas canvas = new Canvas(shapeArray);
        System.out.println(canvas.totalArea());
    }
}
