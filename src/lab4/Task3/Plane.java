package lab4.Task3;

public class Plane extends Vehicle {
    @Override
    public int getTime(int distance) {
        return 3;
    }

    @Override
    public int getCost(int distance) {
        return 4;
    }
}
