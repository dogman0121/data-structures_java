package lab9.Task1;

import lab9.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Вася", 3.34));
        students.add(new Student("Коля", 3.21));

        ArrayList<Student> students1 = new ArrayList<>();

        for(int i = 0; i < students.size(); i++){
            students1.add(students.get(i));
            int j = students1.size() - 1;
            while (j > 0 && students1.get(j).gpa < students.get(j-1).gpa){
                Collections.swap(students1, j, j-1);
                j--;
            }
        }

        System.out.println(students);
        System.out.println(students1);
    }
}
