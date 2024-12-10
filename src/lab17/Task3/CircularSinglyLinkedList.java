package lab17.Task3;

public class CircularSinglyLinkedList<T> {
    // Узел списка
    private static class Node<T> {
        T data;           // Данные узла
        Node<T> next;     // Ссылка на следующий узел

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head; // Голова списка
    private Node<T> tail; // Хвост списка
    private int size;     // Размер списка

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Метод для добавления элемента в конец списка
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Замыкаем цикл
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Замыкаем цикл
        }
        size++;
    }

    // Метод для удаления элемента по значению
    public boolean remove(T data) {
        if (head == null) {
            return false; // Список пуст
        }

        Node<T> current = head;
        Node<T> previous = tail;

        for (int i = 0; i < size; i++) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false; // Элемент не найден
    }

    // Метод для получения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Метод для получения размера списка
    public int size() {
        return size;
    }

    // Метод для проверки, пуст ли список
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для очистки списка
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Метод для вывода всех элементов списка
    public void printList() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("(head)");
    }
}