package lab11.Task1;

public class Employee {
    String name;
    String surname;

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return Employee.this.name + " " + Employee.this.surname;
    }
}
