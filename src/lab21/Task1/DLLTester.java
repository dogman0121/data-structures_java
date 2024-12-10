package lab21.Task1;

public class DLLTester {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Вставка строк
        list.insert("apple");
        list.insert("banana");
        list.insert("cherry");
        list.insert("date");
        list.insert("apricot");
        list.insert("pear");

        // Вывод списка
        System.out.println("Список строк:");
        list.display();
    }
}
