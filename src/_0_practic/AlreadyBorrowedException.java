package _0_practic;

public class AlreadyBorrowedException extends Exception {

    public AlreadyBorrowedException(String message) {
        super(message);
    }


    //4. Кастомное исключение: AlreadyBorrowedException
//    Выбрасывается, если кто-то пытается взять уже выданную книгу/журнал.
}
