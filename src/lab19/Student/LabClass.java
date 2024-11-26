package lab19.Student;

import java.util.Random;

public class LabClass {
    static Random rand = new Random();
    public static LinkedList list = new LinkedList();
    public static void main(String[] args){
        try {
            list.insert("Andrey", 4.8);
            list.insert( "Vladimir", 3.6);
            list.insert( "Alexey", 5.0);
        } catch (EmptyStringException e) {
            System.err.println(e);
            System.exit(-1);
        }

        try {
            list.remove("Artem", 5.0);
        } catch (EmptyListException e) {
            System.err.println(e);
        }

        try {
            Student student = list.find("Andrey", 4.8);
        } catch (StudentNotFoundException e) {
            System.err.println(e);
        }

        try {
            list.selection_sort();
        } catch (EmptyListException e) {
            System.err.println(e);
        }
    }
}