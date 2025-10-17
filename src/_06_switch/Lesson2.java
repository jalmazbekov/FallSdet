package _06_switch;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        Задача: "Регистрация багажа в аэропорту"
//        Ты пишешь программу для регистрации багажа пассажира.
//        Пользователь вводит тип билета:
//        1 → Эконом
//        2 → Бизнес
//        3 → Первый класс
//        Потом вводит вес багажа.
//        Программа считает:
//        В экономе бесплатно до 20 кг, дальше +500 сом за каждый лишний килограмм.
//        В бизнесе бесплатно до 35 кг, дальше +300 сом за кг.
//        В первом классе бесплатно до 50 кг, дальше +100 сом за кг.
//      Если введён неверный тип билета → ошибка.

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите тип билета:");
        System.out.println("1 ) Эконом");
        System.out.println("2 ) бизнес класс");
        System.out.println("3 ) первый класс");
        int ticketType = scanner.nextInt();

        if (ticketType < 1 || ticketType > 3) {
            System.out.println("Ошибка: неверный тип билета");
            return;
        }

        System.out.println("введите вес багажа (в кг )");
        double baggageWeight = scanner.nextDouble();

        double freeWeight = 0;
        double extraCharges = 0;

        switch (ticketType) {
            case 1: //эконом
                freeWeight = 20;
                extraCharges = 500;
                break;
            case 2:
                freeWeight = 35;
                extraCharges = 300;
                break;
            case 3:
                freeWeight = 50;
                extraCharges = 100;
                break;
        }
        double extraWeight = baggageWeight - freeWeight;
        double totalCharge = 0;
        if (extraCharges > 0) {
            totalCharge = extraWeight * extraCharges;

        }
        System.out.println("твой багаж стоит "+totalCharge + " сом2");
    }
}
