package lab6.Task3;

public class Book implements Printable {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void print() {
        System.out.println("Book[title=" + title + ", author=" + author + ", pages=" + pages + "]");
    }
}
