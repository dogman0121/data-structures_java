package lab4.Task2;

public class IntMatrixTester {
    public static void main(String[] args) {
        Integer[][] mas1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] mas2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        IntMatrix m1 = new IntMatrix(mas1);
        IntMatrix m2 = new IntMatrix(mas2);
        System.out.println(m1);
        System.out.println(m2);
        m1.add(m2);
        m1.multiply(5);
        System.out.println(m1);
    }
}
