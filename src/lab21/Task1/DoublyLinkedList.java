package lab21.Task1;

class DoublyLinkedList {
    private Node head; // Голова списка
    private Node tail; // Хвост списка

    class Node {
        String data;      // Строка
        Node prev;        // Ссылка на предыдущий узел
        Node next;        // Ссылка на следующий узел

        // Конструктор узла
        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Вставка строки с сохранением порядка
    public void insert(String str) {
        Node newNode = new Node(str);

        // Если список пуст
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node current = head;

        // Найти позицию для вставки
        while (current != null && shouldInsertAfter(current.data, str)) {
            current = current.next;
        }

        if (current == null) { // Вставить в конец списка
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (current == head) { // Вставить в начало списка
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else { // Вставить между узлами
            Node prevNode = current.prev;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = current;
            current.prev = newNode;
        }
    }

    // Логика сравнения: нужно ли вставить новый элемент ПОСЛЕ текущего
    private boolean shouldInsertAfter(String existing, String newStr) {
        if (existing.length() != newStr.length()) {
            return existing.length() < newStr.length();
        }
        return existing.compareTo(newStr) < 0;
    }

    // Просмотр списка
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}