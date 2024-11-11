package lab4.Task3;

public class Ship extends Vehicle{

    @Override
    int getTime(int distance) {
        return 1;
    }

    @Override
    int getCost(int distance) {
        return 2;
    }
}
