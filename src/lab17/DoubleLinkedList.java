package lab17;

public class DoubleLinkedList {
    private Node head; // Голова списка
    private Node tail; // Хвост списка

    // Вставка строки с сохранением порядка
    public void insert(String str) {
        Node newNode = new Node(str);

        // Если список пуст
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node current = head;

        // Найти место для вставки
        while (current != null && compare(current.data, str)) {
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

    // Сравнение строк: сначала по длине, потом по алфавиту
    private boolean compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return a.compareTo(b) < 0;
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
