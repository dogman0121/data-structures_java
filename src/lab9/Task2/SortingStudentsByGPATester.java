package lab9.Task2;

import lab9.Student;

import java.util.ArrayList;

public class SortingStudentsByGPATester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Вася", 3.34));
        students.add(new Student("Коля", 3.21));
        System.out.println(SortingStudentsByGPA.sort(students));
    }
}
