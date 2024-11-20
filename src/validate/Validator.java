package validate;

public class Validator {
    public static boolean validateDate(int year, int month, int day) {
        boolean visokosniy = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        if (month < 1 || month > 12)
            return false;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return day >= 1 && day <= 31;
            case 2:
                return (day >= 1 && day <= 28) || (visokosniy && day <= 29);
            case 4, 6, 9, 11:
                return day >= 1 && day <= 30;
            default:
                return false;
        }
    }
}
