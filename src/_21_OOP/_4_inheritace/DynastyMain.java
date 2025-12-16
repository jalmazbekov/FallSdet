package _21_OOP._4_inheritace;

public class DynastyMain {
    public static void main(String[] args) {

        King charles = new King("Charles", 76);

        charles.show_current_title();   // Prince
        charles.coronation();           // Конвертация в King
        charles.show_current_title();   // King
    }
}

