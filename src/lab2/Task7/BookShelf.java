package lab2.Task7;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf(Book... books) {
        for (Book book : books) this.books.add(book);
    }

    public Book getOldestBook() {
        Book oldestBook = null;
        for (Book book : books) {
            if (oldestBook == null)
                oldestBook = book;
            else
                if (oldestBook.getYear() < book.getYear())
                    oldestBook = book;

        }
        return oldestBook;
    }

    public Book getNewestBook() {
        Book newestBook = null;
        for (Book book : books) {
            if (newestBook == null)
                newestBook = book;
            else
            if (newestBook.getYear() > book.getYear())
                newestBook = book;

        }
        return newestBook;
    }

    public ArrayList<Book> getBooks() { return this.books; }

    public void sortBooks(){ Collections.sort(this.books); }
}
