package lab11.Task5;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetTime {
    public static void main(String[] args) {
        GetTime.checkAdd();
        GetTime.checkDelete();
        GetTime.checkFind();
    }

    public static void checkAdd() {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        long start, end;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            list1.add(i);
        end = System.currentTimeMillis();
        System.out.println("Время добавления 100000 элементов в ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            list2.add(i);
        end = System.currentTimeMillis();
        System.out.println("Время добавления 100000 элементов в LinkedList: " + (end - start));
    }

    public static void checkDelete() {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            list1.add(i);
            list2.add(i);
        }

        long start, end;
        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            list1.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("Время удаления 100000 элементов в ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            list2.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("Время удаления 100000 элементов в LinkedList: " + (end - start));
    }

    public static void checkFind(){
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            list1.add(i);
            list2.add(i);
        }

        long start, end;
        start = System.currentTimeMillis();
        list1.indexOf(100000 / 2);
        end = System.currentTimeMillis();
        System.out.println("Время поиска в ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        list2.indexOf(100000 / 2);
        end = System.currentTimeMillis();
        System.out.println("Время поиска в LinkedList: " + (end - start));
    }
}
