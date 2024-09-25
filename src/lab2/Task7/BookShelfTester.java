package lab2.Task7;

public class BookShelfTester {
    public static void main(String[] args) {
        Book book1 = new Book("Пиковая дама", "А. С. Пушкин", 1834);
        Book book2 = new Book("Война и мир", "Л. Н. Толстой", 1867);
        Book book3 = new Book("Горе от ума", "А. С. Грибоедов", 1825);
        System.out.println("Изначальный список:");
        BookShelf bookShelf = new BookShelf(book1, book2, book3);
        for (Book book: bookShelf.getBooks())
            System.out.println(book);

        System.out.println("Отсортированный список:");
        bookShelf.sortBooks();
        for (Book book: bookShelf.getBooks())
            System.out.println(book);

        System.out.println("Самая новая книга:");
        System.out.println(bookShelf.getNewestBook());

        System.out.println("Самая старая книга:");
        System.out.println(bookShelf.getOldestBook());
    }
}
