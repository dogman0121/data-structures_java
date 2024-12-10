package lab26.Task1;

import java.util.Stack;

public class ArrayInversion {
    public static void invertArray(int[] array) {
        // Создаём стек
        Stack<Integer> stack = new Stack<>();

        // Помещаем элементы массива в стек
        for (int value : array) {
            stack.push(value);
        }

        // Извлекаем элементы из стека обратно в массив
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Изначальный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Инвертируем массив
        invertArray(array);

        System.out.println("\nИнвертированный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}