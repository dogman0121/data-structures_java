package lab6.Task3;

public class Magazine implements Printable{
    String title;
    String circulation;
    int year;

    public Magazine(String name, String author, int year) {
        this.title = name;
        this.circulation = author;
        this.year = year;
    }

    public void print() {
        System.out.println("Magazine[title=" + title + ", circulation=" + circulation + ", year=" + year + "]");
    }
}
