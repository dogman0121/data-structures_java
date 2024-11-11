package lab6.Task2;

public class MovableCircle implements Movable {
    public int radius;
    public MovablePoint point;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.point = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {point.moveUp();}

    public void moveDown() {point.moveDown();}

    public void moveLeft() {point.moveLeft();}

    public void moveRight() {point.moveRight();}

}
