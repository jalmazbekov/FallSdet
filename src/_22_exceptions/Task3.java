package _22_exceptions;

public class Task3 {
    public static void main(String[] args) {
        try {
            int num = 4;
            if (num % 2 != 0) {
                throw new NumberFormatException(num +"не четная");
            }else {
                System.out.println(num + "четная");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Нурай ты красивая");


    }
}
