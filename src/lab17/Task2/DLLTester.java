package lab17.Task2;

public class DLLTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // 10 <-> 20 <-> 30 <-> null

        list.remove(20);
        list.printList(); // 10 <-> 30 <-> null

        System.out.println("Element at index 1: " + list.get(1)); // 30
        System.out.println("List size: " + list.size()); // 2
        System.out.println("Is list empty? " + list.isEmpty()); // false

        list.clear(); // Очищаем список
        list.printList(); // null
    }
}
