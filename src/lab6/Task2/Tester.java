package lab6.Task2;

public class Tester {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 10, 10, 5);
        circle.moveDown();
        System.out.println(circle.point.x);
        System.out.println(circle.point.y);
    }
}
