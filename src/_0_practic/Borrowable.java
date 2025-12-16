package _0_practic;

public interface Borrowable {

    void borrow(String borrower)throws AlreadyBorrowedException;


    void returnItem();



    //1. interface Borrowable
//методы:
//            - void borrow(String borrower)
//- void returnItem()
//    Этот интерфейс должны реализовывать все объекты, которые можно брать в аренду (например, книга, журнал и т.д.)
}
