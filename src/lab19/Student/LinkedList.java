package lab19.Student;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(String name, double GPA){
        Node new_node = new Node(name, GPA);
        new_node.next = null;
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void remove(String name, double GPA) {
        if (this.head == null) {
            throw new EmptyListException("Can't remove from empty list");
        } else {
            if (this.head.student.name.equals(name) && this.head.student.GPA == GPA) {
                this.head = head.next;
            } else {
                Node curr_node = this.head;
                while (curr_node.next != null) {
                    if (curr_node.next.student.name.equals(name) && curr_node.next.student.GPA == GPA){
                        //System.out.println(curr_node.next);
                        curr_node.next = curr_node.next.next;
                        return;
                    }
                    curr_node = curr_node.next;
                }

            }
        }
    }

    public void print_list() {
        if (this.head == null) {
            System.out.println("[]");
        } else {
            Node current_node = this.head;

            while (current_node != null){
                System.out.println(current_node);
                current_node = current_node.next;
            }
            System.out.println();
        }
    }

    public int length() {
        if (this.head == null) {
            System.out.println("Linked list is empty");
            return 0 ;
        } else {
            int c = 0;
            Node curr_node = this.head;
            while (curr_node != null) {
                c++;
                curr_node = curr_node.next;
            }
            return c;
        }
    }

    public Student find(String name, double GPA) {
        if (this.head == null) {
            System.out.println("empty list");
        } else {
            if (this.head.student.name.equals(name) && this.head.student.GPA == GPA) {
                return this.head.student;
            } else {
                Node curr_node = this.head;
                while (curr_node.next != null) {
                    if (curr_node.next.student.name.equals(name) && curr_node.next.student.GPA == GPA){
                        return curr_node.student;
                    }
                    curr_node = curr_node.next;
                }
            }
        }
        throw new StudentNotFoundException("No students was found");
    }

    public void selection_sort() {
        if (this.head == null) {
            throw new EmptyListException("Can't sort empty list");
        }
        LinkedList res_list = new LinkedList();
        int length = this.length();
        for (int i = 0; i < length; i++) {
            Node curr_node = this.head;
            Student min_GPA_student = this.head.student;
            double min_GPA = 10;
            while (curr_node != null) {
                if (min_GPA > curr_node.student.GPA) {
                    min_GPA = curr_node.student.GPA;
                    min_GPA_student = curr_node.student;
                }
                curr_node = curr_node.next;
            }
            res_list.insert(min_GPA_student.name, min_GPA_student.GPA);
            this.remove(min_GPA_student.name, min_GPA_student.GPA);
        }
        this.head = res_list.head;
    }

}
