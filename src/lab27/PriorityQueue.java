package lab27;

import java.util.Comparator;
import java.util.TreeSet;

public class PriorityQueue {
    private TreeSet<Element> priorityQueue;

    // Вложенный класс для хранения элементов с приоритетом
    private static class Element {
        String value;
        int priority;

        Element(String value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "{" + value + ", priority=" + priority + "}";
        }
    }

    // Инициализация очереди с приоритетом
    public void init() {
        // Компаратор для упорядочивания по приоритету (по возрастанию)
        priorityQueue = new TreeSet<>(Comparator.comparingInt(e -> e.priority));
    }

    // Добавление элемента в очередь
    public void add(String value, int priority) {
        priorityQueue.add(new Element(value, priority));
    }

    // Извлечение элемента с наивысшим приоритетом (минимальный приоритет)
    public Element poll() {
        if (priorityQueue.isEmpty()) {
            return null;
        }
        return priorityQueue.pollFirst(); // Возвращает и удаляет элемент с наименьшим приоритетом
    }

    // Тестирование
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.init();

        // Добавление 10 элементов с разными приоритетами
        queue.add("Task1", 5);
        queue.add("Task2", 1);
        queue.add("Task3", 3);
        queue.add("Task4", 8);
        queue.add("Task5", 2);
        queue.add("Task6", 7);
        queue.add("Task7", 4);
        queue.add("Task8", 6);
        queue.add("Task9", 9);
        queue.add("Task10", 0);

        // Извлечение нескольких элементов
        System.out.println("Извлеченные элементы:");
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll());
        }

        // Оставшиеся элементы
        System.out.println("\nОставшиеся элементы в очереди:");
        for (Element element : queue.priorityQueue) {
            System.out.println(element);
        }
    }
}
