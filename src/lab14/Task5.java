package lab14;

import validate.Validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher = pattern.matcher(s);
        String[] data;
        if (matcher.find()){
            data = matcher.group().split("/");
            if (Validator.validateDate(Integer.parseInt(data[2]),
                    Integer.parseInt(data[1]), Integer.parseInt(data[0]))) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        System.exit(1);
    }
}
