package _0_practic;

public class Magazine extends  LibraryItem implements Borrowable{
    protected int issueNumber;


    public Magazine(String title, boolean isBorrowed, int issueNumber) {
        super(title, isBorrowed);
        this.issueNumber = issueNumber;
    }

    @Override
    public void borrow(String borrower) throws AlreadyBorrowedException {
        if (isBorrowed()){
           throw new AlreadyBorrowedException("журнал уже взята!");
        }
        System.out.println("вы взяли журнал!" + borrower);
    }

    @Override
    public void returnItem() {
        if (!isBorrowed()){
            System.out.println("Журнал возвращен!");
        }
        System.out.println("журнал и так был в библиотеке");

    }

    @Override
    public void printInfo() {
        System.out.println("Название: " + getTitle() + "\nМожно ли взять? " + isBorrowed() + "\nНомер выпуска: " + issueNumber);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                '}';
    }
}
