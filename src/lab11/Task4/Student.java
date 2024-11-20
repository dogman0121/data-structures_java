package lab11.Task4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class Student implements Comparable<Student>{
    public String name;
    public Calendar dateOfBirth;
    public double gpa;

    public Student(String name, Calendar dateOfBirth, double gpa) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public String toString(String dateFormat) {
        DateFormat df = new SimpleDateFormat(dateFormat);
        return "Student [name=" + name + ", date_of_birthday=" + df.format(this.dateOfBirth.getTime()) + ", gpa=" + gpa + "]";
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
