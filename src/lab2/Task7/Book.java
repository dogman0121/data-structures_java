package lab2.Task7;

import java.util.Scanner;
import java.lang.Integer;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public Integer getYear() { return year; }

    public void setYear(Integer year) { this.year = year; }

    public String toString() {
        return "Book [title=\"" + title + "\", author=\"" + author + "\", year=" + year + "]";
    }

    @Override
    public int compareTo(Book o) {
        return this.year.compareTo(o.year);
    }
}
