package _0_practic;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());

        Book book1 = new Book("java руководства для начинающих 9-издание", true, "Герберт Шилдт");
        Book book2 = new Book("java поликлиника", false, "Васильев А.Н");

        Magazine magaz1 = new Magazine("игра блек раш", true, 07);
        Magazine magaz2 = new Magazine("ак кеме", false, 999);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magaz1);
        library.addItem(magaz2);

        library.displayAllItems();

        try {
            library.borrowItem("java руководства для начинающих 9-издание", "Герберт Шилдт");
        } catch (AlreadyBorrowedException e) {
            e.printStackTrace();
        }
        System.out.println("___");

        library.returnItem("java руководства для начинающих 9-издание");

        try {
            library.borrowItem("java руководства для начинающих 9-издание", "Салих");
        } catch (AlreadyBorrowedException e) {
            e.printStackTrace();
        }


    }
}
