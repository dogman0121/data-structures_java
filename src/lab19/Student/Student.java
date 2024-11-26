package lab19.Student;

public class Student implements Comparable<Student> {
    String name;
    Double GPA;

    public Student(String name, double GPA) {
        if (name.isEmpty()) {
            throw new EmptyStringException("name can't be empty string");
        }
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() { return name; }
    public Double getGPA() { return GPA; }
    public void setName(String name) { this.name = name;}
    public void setGPA(Double GPA) {this.GPA = GPA;}

    @Override
    public int compareTo(Student student) {
        return Double.compare(this.getGPA(), student.getGPA());
    }

    @Override
    public String toString() {
        return "Student[name='" + name + "' GPA=" + GPA + "]";
    }
}