package lab26.Task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Iterable<T> {
    // Узел двусвязного списка
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head; // Голова списка
    private Node<T> tail; // Хвост списка
    private int size = 0;

    // Добавление элемента в конец списка
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Удаление элемента по значению
    public boolean remove(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Удаляемый элемент — голова
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // Удаляемый элемент — хвост
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Получение размера списка
    public int size() {
        return size;
    }

    // Реализация итератора
    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator();
    }

    private class DoublyLinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data;
            current = current.next;
            return data;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported in this iterator");
        }
    }

    // Метод для печати списка
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        // Добавляем элементы
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Печатаем список
        System.out.println("Список после добавления:");
        list.printList();

        // Используем итератор для обхода
        System.out.println("\nОбходим список с помощью итератора:");
        for (String item : list) {
            System.out.println(item);
        }

        // Удаляем элемент
        list.remove("Banana");
        System.out.println("\nСписок после удаления 'Banana':");
        list.printList();
    }
}
