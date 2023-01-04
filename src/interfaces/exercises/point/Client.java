package interfaces.exercises.point;

public class Client {

    public static void main(String[] args) {
        Movable movable = new Point(1,2);

        System.out.println(movable);
        movable.moveUp(1);

        System.out.println(movable);

        movable.moveLeft(2);

        System.out.println(movable);
    }
}
