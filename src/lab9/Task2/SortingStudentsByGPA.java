package lab9.Task2;

import lab9.Student;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentsByGPA{
    public static ArrayList<Student> sort(ArrayList<Student> students){
        return new SortingStudentsByGPA().quickSort(students);
    }

    private ArrayList<Student> quickSort(ArrayList<Student> students) {
        if (students.size() <= 1) return students;
        if (students.size() <= 2) {
            if (students.get(0).compareTo(students.get(1)) > 0){
                Collections.swap(students, 0, 1);
                return students;
            }
            return students;
        };

        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        Student pivot = students.get(students.size()/2);

        for(Student student : students) {
            if (pivot.compareTo(student) >= 0) {
                left.add(student);
            }
            else {
                right.add(student);
            }
        }
        System.out.println(left);
        System.out.println(right);

        ArrayList<Student> sortedLeft = quickSort(left);
        ArrayList<Student> sortedRight = quickSort(right);
        sortedLeft.addAll(sortedRight);
        return sortedLeft;
    }

}
