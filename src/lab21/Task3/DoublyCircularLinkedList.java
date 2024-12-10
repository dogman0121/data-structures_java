package lab21.Task3;

class DoublyCircularLinkedList {
    private Node head; // Голова списка

    class Node {
        String data;   // Хранит строку
        Node prev;     // Ссылка на предыдущий узел
        Node next;     // Ссылка на следующий узел

        // Конструктор
        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Конструктор
    public DoublyCircularLinkedList() {
        head = null;
    }

    // Вставка строки с сохранением упорядоченности
    public void insert(String str) {
        Node newNode = new Node(str);

        // Если список пуст
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node current = head;

        // Найти место для вставки
        do {
            if (compare(current.data, str)) {
                current = current.next;
            } else {
                break;
            }
        } while (current != head);

        // Вставка перед текущим узлом
        Node prevNode = current.prev;
        newNode.next = current;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        current.prev = newNode;

        // Обновить голову, если новый элемент меньше
        if (current == head && compare(str, head.data)) {
            head = newNode;
        }
    }

    // Сравнение строк: сначала по длине, затем по алфавиту
    private boolean compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return a.compareTo(b) < 0;
    }

    // Просмотр списка
    public void display() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}
