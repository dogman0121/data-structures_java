package lab9.Task3;

import lab9.Student;

import java.util.ArrayList;

public class MergeStudentsListsTester {
    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();

        students1.add(new Student("Вася", 3.23));
        students2.add(new Student("Коля", 3.13));
        System.out.println(MergeStudentsLists.merge(students1, students2));
    }
}
