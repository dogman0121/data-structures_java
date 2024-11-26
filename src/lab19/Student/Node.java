package lab19.Student;

public class Node {
    Student student;
    Node next;

    public Node(String name, double GPA) {
        this.student = new Student(name, GPA);
        this.next = null;
    }

    @Override
    public String toString() {
        return student.toString();
    }
}