package _05_if_else_statements;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        // Рост > 140 см
        // Вес < 100 кг
        // Возраст > 10 && < 50
        // Возраст < 10 и < 18 → получить согласие родителей
        // Стоимость билета = 500 сом

        Scanner input = new Scanner(System.in);

        // Ввод данных
        System.out.println("Введите Ваш рост (см): ");
        double height = input.nextDouble();

        if (height > 140) {
            System.out.println("Введите Ваш вес (кг): ");
            double weight = input.nextDouble();

            if (weight < 100) {
                System.out.println("Введите Ваш возраст: ");
                int age = input.nextInt();

                if (age < 10 || age > 50) {
                    System.out.println("Ваш возраст не разрешен");
                } else {
                    if (age > 10 && age < 18) {
                        System.out.println("У Вас есть разрешение на катание представителей?");
                        boolean permission = input.nextBoolean(); // true/false
                        if (permission) {
                            System.out.println("Добро пожаловать на аттракцион");
                        } else {
                            System.out.println("К сожалению, мы не можем Вас впустить на аттракцион без разрешения представителей");
                        }
                    } else if (age >= 18 && age <= 50) {
                        System.out.println("Добро пожаловать на аттракцион");
                    } else {
                        System.out.println("Ваш возраст должен быть 10-50 лет");
                    }
                }
            } else {
                System.out.println("Ваш вес превышает допустимый предел (max < 100 кг)");
            }
        } else {
            System.out.println("У Вас слишком маленький рост (min < 140 см)");
        }
    }
}
