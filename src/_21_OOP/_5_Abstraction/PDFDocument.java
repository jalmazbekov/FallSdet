package _21_OOP._5_Abstraction;

public class PDFDocument extends Document {

    public PDFDocument(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("Печать PDF: <title>");

    }

    @Override
    public String toString() {
        return "PDFDocument{" +
                "title='" + title + '\'' +
                '}';
    }
}
