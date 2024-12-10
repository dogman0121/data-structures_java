package lab17.Task1;

public class SinglyLinkedList<T> {
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
    private int size;     // Размер списка

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Метод для добавления элемента в конец списка
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Метод для удаления элемента по значению
    public boolean remove(T data) {
        if (head == null) {
            return false; // Список пуст
        }

        if (head.data.equals(data)) {
            head = head.next; // Удаляем голову
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) {
            return false; // Элемент не найден
        }

        current.next = current.next.next;
        size--;
        return true;
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
        head = null; // Отсоединяем голову
        size = 0;   // Обнуляем размер
    }

    // Метод для вывода всех элементов списка
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
