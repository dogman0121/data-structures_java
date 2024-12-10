package lab20.Task4;

public class Calculator {

    // Метод сложения
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Метод умножения
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Метод деления
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a.doubleValue() / b.doubleValue();
    }

    // Метод вычитания
    public static <T extends Number, U extends Number> double subtraction(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }
}