package _21_OOP._5_Abstraction;

public abstract class Document {
    String title;

    public Document(String title) {
        this.title = title;
    }

    public abstract void print();
}
