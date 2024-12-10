package lab21.Task2;

public class SLLTester {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Вставка значений
        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(6); // Переполнение: создается новый узел
        list.insert(7);

        // Вывод списка
        System.out.println("Список:");
        list.display();
    }
}
