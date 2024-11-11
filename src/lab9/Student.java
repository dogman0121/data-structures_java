package lab9;

public class Student implements Comparable<Student>{
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.gpa < o.gpa)
            return -1;
        else if (this.gpa > o.gpa)
            return 1;
        return 0;
    }
}
