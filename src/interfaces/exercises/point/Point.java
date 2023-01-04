package interfaces.exercises.point;

public class Point implements Movable {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp(int speed) {
        this.y += speed;
    }

    @Override
    public void moveDown(int speed) {
        this.y -= speed;
    }

    @Override
    public void moveLeft(int speed) {
        this.x -= speed;
    }

    @Override
    public void moveRight(int speed) {
        this.x += speed;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
