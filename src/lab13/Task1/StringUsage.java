package lab13.Task1;

public class StringUsage {
    public static void main(String[] args) {
        StringUsage.method("I like Java!!!");
    }

    public static void method(String string){
        System.out.println(string.charAt(string.length()-1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("Java"));
        System.out.println(string.indexOf("Java"));
        string = string.replace("o", "a");
        System.out.println(string);
        string = string.toLowerCase();
        System.out.println(string);
        string = string.toUpperCase();
        System.out.println(string);
        System.out.println(string.substring(string.indexOf("JAVA"), string.indexOf("JAVA") + 4));
    }
}
