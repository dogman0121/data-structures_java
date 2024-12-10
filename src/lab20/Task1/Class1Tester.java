package lab20.Task1;

public class Class1Tester {
    public static void main(String[] args) {
        Class1<String, String, String> cls = new Class1<>("123", "123", "123");
        cls.printVar();
        cls.printVarTypes();
    }
}
