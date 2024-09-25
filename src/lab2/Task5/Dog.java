package lab2.Task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) { this.age = age; }

    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public int convertToPeopleAge() { return this.age * 7; }

    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}
