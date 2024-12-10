package lab28;

import java.util.HashMap;
import java.util.Map;

public class PeopleMap {
    // Метод для создания карты
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Ivan");
        map.put("Kuznetsov", "Alexey");
        map.put("Smirnov", "Sergey");
        map.put("Popov", "Petr");
        map.put("Sokolov", "Andrey");
        map.put("Mikhailov", "Sergey");
        map.put("Fedorov", "Ivan");
        map.put("Nikolaev", "Alexey");
        return map;
    }

    // Метод для подсчета людей с одинаковыми именами
    public static int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : map.values()) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        int count = 0;
        for (int occurrences : nameCount.values()) {
            if (occurrences > 1) {
                count += occurrences;
            }
        }
        return count;
    }

    // Метод для подсчета людей с одинаковыми фамилиями
    public static int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }
        int count = 0;
        for (int occurrences : lastNameCount.values()) {
            if (occurrences > 1) {
                count += occurrences;
            }
        }
        return count;
    }

    // Тестирование (не выводит текст на экран)
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int sameFirstNameCount = getSameFirstNameCount(map);
        int sameLastNameCount = getSameLastNameCount(map);
        // Результаты (для отладки можно временно включить вывод)
        System.out.println("Количество людей с одинаковыми именами: " + sameFirstNameCount);
        System.out.println("Количество людей с одинаковыми фамилиями: " + sameLastNameCount);
    }
}
