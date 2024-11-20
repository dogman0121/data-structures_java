package lab2.Task7;

import lab2.Task7.Book;

public class BookTester {
    public static void main(String[] args) {
        Book book = new Book("Горе от ума", "А. С. Грибоедов", 1825);
        System.out.println(book);
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getYear());
    }
}
