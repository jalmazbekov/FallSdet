package _21_OOP._4_inheritace;

public class MainFam {
    public static void main(String[] args) {
        Dad dad = new Dad("James", 22);
        System.out.println(dad);
        dad.draw();

        Son son = new Son("Joma", 13);
        System.out.println(son);
        son.draw();

    }

}
