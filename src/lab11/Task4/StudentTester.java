package lab11.Task4;

import java.util.Calendar;

public class StudentTester {
    public static void main(String[] args) {
        Student s = new Student("Алеша", Calendar.getInstance(), 4.23);
        System.out.println(s.toString("dd MM YYYY"));
    }
}
