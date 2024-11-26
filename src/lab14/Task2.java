package lab14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        if (p.matcher(s).matches()) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
