package _10_Loops;

import java.util.Scanner;

public class HomeWorkWhile {
    public static void main(String[] args) {

      lesson();
    }

    public static void lesson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess secret number: ");

        int user_ent = 0;
        int secret_num = 5;


        while (true) {
            user_ent = scanner.nextInt();
            if (user_ent < 1 || user_ent > 10) {
                System.out.println("Выберите число между 1-10");
            } else if (user_ent == secret_num) {
                System.out.println("Right");
                break;
            } else if (user_ent == 4 || user_ent == 6) {
                System.out.println("тепло");
            } else if (user_ent < 4 || user_ent > 6) {
                System.out.println("холодно");
            }
        }
    }
}
