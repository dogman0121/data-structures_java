package lab9.Task3;

import lab9.Student;

import java.util.ArrayList;

public class MergeStudentsLists {
    public static ArrayList<Student> merge(ArrayList<Student> list1, ArrayList<Student> list2) {
        int l = 0, r = 0;
        ArrayList<Student> result = new ArrayList<>();
        while (l < list1.size() && r < list2.size()) {
            if (list1.get(l).compareTo(list2.get(r)) > 0) {
                result.add(list2.get(r));
                r++;
            }
            else {
                result.add(list1.get(l));
                l++;
            }
        }
        while (l < list1.size()) {
            result.add(list1.get(l));
            l++;
        }

        while (r < list2.size()) {
            result.add(list2.get(r));
            r++;
        }
        return result;
    }
}
