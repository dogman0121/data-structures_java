package lab27;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
    private Map<Integer, String> table;

    // Инициализация хэш-таблицы
    public void hashtabInit() {
        table = new HashMap<>();
    }

    // Хэш-функция (для демонстрации, не используется в HashMap)
    private int hashtabHash(String key) {
        return Math.abs(key.hashCode());
    }

    // Добавление элемента в таблицу
    public void hashtabAdd(String key, String value) {
        table.put(key.hashCode(), value);
    }

    // Поиск элемента по ключу
    public String hashtabLookup(String key) {
        return table.get(key.hashCode());
    }

    // Удаление элемента из таблицы
    public void hashtabRemove(String key) {
        table.remove(key.hashCode());
    }

    // Тестирование
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit();

        // Добавление 10 элементов
        for (int i = 1; i <= 10; i++) {
            hashTable.hashtabAdd("key" + i, "value" + i);
        }

        // Поиск элементов
        System.out.println("Поиск элементов:");
        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            System.out.println(key + ": " + hashTable.hashtabLookup(key));
        }

        // Попытка поиска несуществующего элемента
        System.out.println("Поиск несуществующего элемента: key11 -> " + hashTable.hashtabLookup("key11"));

        // Удаление нескольких элементов
        System.out.println("\nУдаление элементов key3, key7:");
        hashTable.hashtabRemove("key3");
        hashTable.hashtabRemove("key7");

        // Проверка после удаления
        System.out.println("Поиск после удаления:");
        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            System.out.println(key + ": " + hashTable.hashtabLookup(key));
        }
    }
}

