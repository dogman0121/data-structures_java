package lab17;

public class DDLTester {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

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
