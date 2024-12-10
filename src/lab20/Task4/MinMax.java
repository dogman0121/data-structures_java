package lab20.Task4;

import java.util.Arrays;
import java.util.Comparator;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    // Конструктор принимает массив
    public MinMax(T[] array) {
        this.array = array;
    }

    // Метод для нахождения минимального элемента
    public T findMin() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        return Arrays.stream(array).min(Comparator.naturalOrder()).orElse(null);
    }

    // Метод для нахождения максимального элемента
    public T findMax() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        return Arrays.stream(array).max(Comparator.naturalOrder()).orElse(null);
    }

    // Метод для отображения массива (опционально)
    public void displayArray() {
        System.out.println(Arrays.toString(array));
    }
}