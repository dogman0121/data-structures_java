package lab11.Task1;

public class TaskTester {
    public static void main(String[] args) {
        Employee e = new Employee("Коля", "Иванов");
        Task task = new Task(e);
        task.end();
        System.out.println(task);
    }
}
