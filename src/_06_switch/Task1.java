package _06_switch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер времени года (1 - зима, 2 - осень, 3 - весна, 4 - лето)");
        int number = input.nextInt(); // <-- заменили nextLine() на nextInt()

        switch (number) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("осень");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("лето");
                break;
            default:
                System.out.println("неверное время года");
        }
    }
}
