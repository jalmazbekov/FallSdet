package _21_OOP._5_Abstraction;

public class DocumentMain {
    public static void main(String[] args) {
        PDFDocument pdfDocument = new PDFDocument("документы");
        System.out.println("Печать PDF: " + pdfDocument.title);


        pdfDocument.print();
    }
}
