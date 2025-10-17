package _06_switch;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("выберите фильм по номеру:");
        System.out.println("1: marvel");
        System.out.println("2: zombi x");
        System.out.println("3: Titanic");
        System.out.println("4 : avatar ang");
        int choice = scanner.nextInt();
        String muvi;
        switch (choice) {
            case 1:
                muvi = "marvel";
                break;
            case 2:
                muvi = " zombi x";
                break;
            case 3:
                muvi = "Titanic";
                break;
            case 4:
                muvi = "avatar ang";
                break;
            default:
                muvi = "такого  фильма не существует";
                break;
        }
        System.out.println("Вы выбрали фильм " + muvi);
        if (choice < 1 || choice > 4) {
            System.out.println("побробуйте выбрать другой фильм");
        } else {
            System.out.println("введите ваш возраст");
            int age = scanner.nextInt();
            String price = "";

            if (age < 7) {
                System.out.println("бесплатно ");
            } else if (age >= 7 && age <= 18) {
                price = "150сом эле";
            } else if (age >= 19 && age <= 60) {
                price = "300сом ";
            } else {
                price = "200$$$$$$$$$$$";

            }
            System.out.println("цена билета для вас:" + price);

        }
    scanner.close();
    }
}