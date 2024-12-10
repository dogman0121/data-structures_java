package lab17.Task1;

public class SLLTester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // 10 -> 20 -> 30 -> null

        list.clear(); // Очищаем список
        list.printList(); // null

        System.out.println("List size after clear: " + list.size()); // 0
        System.out.println("Is list empty? " + list.isEmpty()); // true
    }
}
