package lab21.Task3;

public class DCLLTester {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

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
