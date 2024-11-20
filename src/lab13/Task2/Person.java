package lab13.Task2;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String ...args) {
        this.name = args.length > 0 ? args[0] : "";
        this.surname = args.length > 1 ? args[1] : "";
        this.patronymic = args.length > 2? args[2] : "";
    }

    public String getFullName() {
        return String.format("%s %s %s", name, surname, patronymic);
    }
}
