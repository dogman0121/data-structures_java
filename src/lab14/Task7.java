package lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
