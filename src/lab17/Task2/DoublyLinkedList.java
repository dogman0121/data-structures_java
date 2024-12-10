package lab17.Task2;

public class DoublyLinkedList<T> {
    // Узел списка
    private static class Node<T> {
        T data;           // Данные узла
        Node<T> next;     // Ссылка на следующий узел
        Node<T> prev;     // Ссылка на предыдущий узел

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> head; // Голова списка
    private Node<T> tail; // Хвост списка
    private int size;     // Размер списка

    public DoublyLinkedList() {
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
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Метод для удаления элемента по значению
    public boolean remove(T data) {
        if (head == null) {
            return false; // Список пуст
        }

        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
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
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}