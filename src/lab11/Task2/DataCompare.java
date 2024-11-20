package lab11.Task2;

import java.util.Date;
import java.util.Scanner;
import validate.Validator;

public class DataCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int day = sc.nextInt();

        if (!Validator.validateDate(year, month, day))
            System.exit(0);

        Date calendar = new Date();
        calendar.setYear(year-1900);
        calendar.setMonth(month-1);
        calendar.setDate(day);

        Date currentDate = new Date();

        if (calendar.getYear() == year && calendar.getMonth() == month && calendar.getDate() == day)
            System.out.println("Даты одинаковы");
        else if (calendar.compareTo(currentDate) < 0)
            System.out.println("Введенная дана меньше");
        else if (calendar.compareTo(currentDate) > 0)
            System.out.println("Введенная дата больше");
    }
}
