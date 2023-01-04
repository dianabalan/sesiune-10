package interfaces.shapes;

public interface Shape {


    double area();
    double perimeter();

    default void displayShapeInfo(){
        System.out.println("This is the default display info shape. Please override.");
    }

}
