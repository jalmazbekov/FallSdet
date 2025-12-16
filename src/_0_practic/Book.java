package _0_practic;

public class Book extends LibraryItem  implements Borrowable {
    protected  String author;



    public Book(String title, boolean isBorrowed,String author) {
        super(title, isBorrowed);
        this.author = author;

    }

    @Override
    public void borrow(String borrower) throws AlreadyBorrowedException {
        if (isBorrowed()){
           throw new AlreadyBorrowedException("Книга уже взята!");
        }
        System.out.println("вы взяли книгу!" + borrower);
    }

    @Override
    public void returnItem() {
        if (!isBorrowed()){
            System.out.println("книга возвращена!");
        }
        System.out.println("книга и так в библиотеке!");
    }

    @Override
    public void printInfo() {
        System.out.println("Название книги: " + getTitle() + "\nАвтор книги: " + author + "\nЗанята ли книга? " + isBorrowed());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }
//1. interface Borrowable
//методы:
//            - void borrow(String borrower)
//- void returnItem()
//    Этот интерфейс должны реализовывать все объекты, которые можно брать в аренду (например, книга, журнал и т.д.)
//2. abstract class LibraryItem
//Поля:
//    String title — название
//    boolean isBorrowed - статус: выдана или нет
//    Методы:
//            - abstract void printInfo() - абстрактный метод, вывод информации об объекте
//- геттеры/сеттеры
//3. Классы-наследники:

//    class Book наследует LibraryItem и реализует Borrowable
//            Дополнительное поле:
//    String author
//    Переопределить метод printInfo()
//    _________________________________________
//    class Magazine наследует LibraryItem и реализует Borrowable
//            Дополнительное поле:
//    int issueNumber
//    Переопределить метод printInfo()
//    _________________________________________
//4. Кастомное исключение: AlreadyBorrowedException
//    Выбрасывается, если кто-то пытается взять уже выданную книгу/журнал.
//5. class Library
//Поля:
//    List<LibraryItem> items
//    Методы:
//            - addItem(LibraryItem item)
//- displayAllItems()
//- borrowItem(String title, String borrower)
//- returnItem(String title)
}
