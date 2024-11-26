package lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern p = Pattern.compile("\\+( )?\\d");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
