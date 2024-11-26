package lab17;

public class Node {
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
