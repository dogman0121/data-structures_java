package lab23.Task5;

public class LQTester {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek());    // Вывод: 1
        System.out.println(queue.dequeue()); // Вывод: 1
        System.out.println(queue.size());    // Вывод: 2
        System.out.println(queue.isEmpty()); // Вывод: false
    }
}
