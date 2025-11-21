package _21_OOP._3_Encapsulation;

public class LibraryBookMain {
    static void main() {

        LibraryBook book = new LibraryBook("Hurry Potter", "Joanne Rowling", 10,20);
        System.out.println(book.title);
        System.out.println(book.getAuthor());
        System.out.println(book.getTotalCopies());
        System.out.println(book.takeBook(8));
    }
}

