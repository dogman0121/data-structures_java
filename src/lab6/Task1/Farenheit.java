package lab6.Task1;

class Farenheit implements Temperature {
    public double convert(double t) {
        return t * 9 / 5 + 32;
    }
}