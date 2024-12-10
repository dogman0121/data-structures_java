package lab28;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSet {
    public static void main(String[] args) {
        // Создаем и заполняем HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Выводим содержимое HashSet
        System.out.println("HashSet: " + hashSet);

        // Преобразуем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Выводим содержимое TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}