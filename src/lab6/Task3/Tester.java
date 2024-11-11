package lab6.Task3;

public class Tester {
    public static void main(String[] args) {
        Printable[] array = new Printable[2];
        array[0] = new Book("Евгений Онегин", "А. С. Пушкин", 200);
        array[1] = new Magazine("Playboy", "Хью Хеффнер", 3000000);
        for (Printable printable : array) {
            printable.print();
        }
    }
}
