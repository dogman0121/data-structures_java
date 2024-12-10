package lab24.Task1;

public class ComplexTester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex c1 = factory.createComplex();  // создаем комплексное число 0 + 0i
        Complex c2 = factory.createComplex(3, 4);  // создаем комплексное число 3 + 4i

        System.out.println("Комплексное число 1: " + c1);
        System.out.println("Комплексное число 2: " + c2);
    }
}
