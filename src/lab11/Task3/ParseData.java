package lab11.Task3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ParseData {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате:\n<Год><Месяц><Число>\n<Часы1><минуты>");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String time = sc.nextLine();
        ArrayList<Integer> dateList = ParseData.parseTags(date);
        ArrayList<Integer> timeList = ParseData.parseTags(time);
        Calendar calendar = Calendar.getInstance();
        calendar.set(dateList.get(0), dateList.get(1)-1, dateList.get(2), timeList.get(0), timeList.get(1));
        Date dt = new Date(calendar.getTimeInMillis());
        System.out.println(dt);
    }

    public static ArrayList<Integer> parseTags(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                while (++i < s.length() && s.charAt(i) != '>') {
                    temp = temp * 10 + s.charAt(i) - '0';
                }
            }
            list.add(temp);
            temp = 0;
        }

        return list;
    }

}
