package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().solve3(args);
    }

    public void solve1() {
        int[] a = new Main().generateRandomArray(10, 0, 10);
        System.out.println("Исходный массив:");
        new Main().printArray(a);
        System.out.println("\n");
        System.out.println("Сумма чисел:");
        System.out.println(new Main().sum(a, 10));
    }

    public void solve2() {
        int []a = new int[2];
        int size = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            if (a.length == size)
                a = new Main().resizeArray(a, a.length * 2);

            a[size] = sc.nextInt();
            size++;
        }

        System.out.println("Сумма элементов массива с помощью do-while:");
        System.out.println(new Main().sumDoWhile(a, size));
        System.out.println("Сумма элементов массива с помощью while:");
        System.out.println(new Main().sumWhile(a, size));
        System.out.println("Максимальный элемент в массиве:");
        System.out.println(new Main().getMaxInteger(a, size));
        System.out.println("Минимальный элемент в массиве:");
        System.out.println(new Main().getMinInteger(a, size));
    }

    public void solve3(String[] args){
        String arg;
        for (int i=0; i<args.length; i++) {
            arg = args[i];
            System.out.println(arg);
        }
    }

    public void solve4(){
        double x;
        for(int i = 1; i <= 10; i++){
            x = 1.0/i;
            System.out.printf("%.5f\n", x);
        }
    }

    public void solve5(){
        new Main().test_factorial();
    }

    public void test_factorial(){
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {1, 2, 6, 24, 120, 720};

        for (int i=0; i<input.length; i++){
            if (factorial(input[i]) == output[i])
                System.out.println("Тест " + i+1 + " пройден");
            else {
                System.out.println("Неверный ответ! \nВвод: " + input[i] + "\nОжидаемый вывод: " + output[i] + "\nПолученный вывод: " + factorial(input[i]));
            }
        }
    }

    public int factorial(int n){
        int i = 1;
        for(int j = 1; j <= n; j++)
            i = i * j;
        return i;
    }

    public int[] resizeArray(int[] a, int newLength) {
        int[] newArray = new int[newLength];
        for(int i = 0; i < Math.min(a.length, newLength); i++)
            newArray[i] = a[i];
        return newArray;
    }

    public int sum(int[] mas, int size){
        int result = 0;
        for (int i = 0; i < size; i++)
            result += mas[i];
        return result;
    }

    public int sumDoWhile(int[] mas, int size){
        int result = 0;
        int i = 0;
        do {
            if (mas.length != 0) {
                result += mas[i];
                i += 1;
            }
        } while (i < size);
        return result;
    }

    public int sumWhile(int[] mas, int size){
        int result = 0;
        int i = 0;
        while (i < size) {
            result += mas[i];
            i += 1;
        }
        return result;
    }

    public int getMaxInteger(int[] mas, int size){
        if (mas.length == 0) {
            return 0;
        }

        int result = mas[0];
        int i = 0;
        while (i < size) {
            if (mas[i] > result)
                result = mas[i];
            i += 1;
        }
        return result;
    }

    public int getMinInteger(int[] mass, int size){
        if (mass.length == 0) {
            return 0;
        }
        int result = mass[0];
        int i = 0;
        while (i < size) {
            if (mass[i] < result)
                result = mass[i];
            i += 1;
        }
        return result;
    }

    public int[] generateRandomArray(int size, int start, int end){
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] = generateRandomNumber(start, end);
        return result;
    }

    public int generateRandomNumber(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
