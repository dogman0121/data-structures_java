package lab4.Task3;

public class Car extends Vehicle {
    @Override
    public int getTime(int distance) {
        return 5;
    }

    @Override
    public int getCost(int distance){
        return 6;
    }
}
