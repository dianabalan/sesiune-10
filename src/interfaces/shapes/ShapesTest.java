package interfaces.shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Shape circle = new Circle("blue", 20);

        Shape rectangle = new Rectangle("red", 10, 20);

        System.out.println("area circle: " + circle.area());
        System.out.println("perimeter circle: " + circle.perimeter());
        circle.displayShapeInfo();

        //        Circle circle2 = new Circle(10);
        //        circle2.displayRadius();

        System.out.println("area rectangle: " + rectangle.area());
        System.out.println("perimeter rectangle: " + rectangle.perimeter());
        rectangle.displayShapeInfo();
    }
}
