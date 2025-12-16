package _0_practic;

public abstract class LibraryItem {
   private String title;
   private boolean isBorrowed;


    public LibraryItem(String title, boolean isBorrowed) {
        this.title = title;
        this.isBorrowed = isBorrowed;
    }

   public abstract void printInfo();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
//2. abstract class LibraryItem
//Поля:
//    String title — название
//    boolean isBorrowed - статус: выдана или нет
//    Методы:
//            - abstract void printInfo() - абстрактный метод, вывод информации об объекте
//- геттеры/сеттеры