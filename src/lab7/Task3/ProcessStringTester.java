package lab7.Task3;

public class ProcessStringTester {
    public static void main(String[] args) {
        String s = "qwerty";
        System.out.println(new ProcessString().reverseString(s));
        System.out.println(new ProcessString().countSymbols(s, 'a'));
        System.out.println(new ProcessString().getNotEvenString(s));
    }
}
