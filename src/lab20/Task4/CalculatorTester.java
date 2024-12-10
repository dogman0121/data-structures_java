package lab20.Task4;

public class CalculatorTester {
    // Тестирование класса
    public static void main(String[] args) {
        // Примеры использования
        int x = 10;
        double y = 20.5;

        System.out.println("Sum: " + Calculator.sum(x, y));
        System.out.println("Multiply: " + Calculator.multiply(x, y));
        System.out.println("Divide: " + Calculator.divide(x, y));
        System.out.println("Subtraction: " + Calculator.subtraction(x, y));

        float a = 15.5f;
        long b = 30L;

        System.out.println("\nSum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
        System.out.println("Subtraction: " + Calculator.subtraction(a, b));
    }
}
