package lab13.Task5;

public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    public static PhoneNumber parseNumber(String number) {
        String phoneNumber = number.substring(number.length()-10, number.length());
        String countryCode = number.substring(1, number.length()-10);
        return new PhoneNumber(countryCode, phoneNumber);
    }

    public String toString() {
        return "+" + countryCode + "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }
}
