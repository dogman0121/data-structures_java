package lab4.Task3;

public abstract class Vehicle {

    private int maxSpeed;

    abstract int getTime(int distance);

    abstract int getCost(int distance);

    public void setSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    };

    public int getSpeed(){
        return maxSpeed;
    };
}
