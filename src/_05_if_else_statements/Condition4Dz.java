package _05_if_else_statements;

import java.util.Scanner;

public class Condition4Dz {
    public static void main(String[] args) {

        Scanner moodGame = new Scanner(System.in);

        System.out.println("привет  тарзанку! Нажмите Enter пж пж, чтоб войти 🦐");
        moodGame.nextLine();

        System.out.print("Введите свой возрастттт: ");
        int playerAge = moodGame.nextInt();

        System.out.print("Введите свой жир: ");
        int playerWeight = moodGame.nextInt();

        System.out.print("Вы согласны прыгать если нет  пепси пейте? (true/false): ");
        boolean consent = moodGame.nextBoolean();

        System.out.print("Внесите оплату  (1500 сом ) тебе 1500 а так 100сом: ");
        int payment = moodGame.nextInt();

        if (playerAge >= 18 && playerWeight > 45 && playerWeight < 75 && consent) {
            if (payment == 1500) {
                System.out.println("Оплата принята ");
                System.out.println("Можете прыгать");
            } else if (payment > 1500) {
                int change = payment - 1500;
                System.out.println("Оплата принята");
                System.out.println("Ваша сдача: " + change + " сом 💵");
                System.out.println("Можете  прыгааать");
            } else {
                System.out.println("денег нема❌");
            }
        } else {
            System.out.println("Извините, вы не подходите для прыжка 🚫");
        }

        moodGame.close();
    }
}
