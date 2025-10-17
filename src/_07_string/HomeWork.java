package _07_string;

import java.util.Scanner;

public class HomeWork {

        public static void main() {
//        Home work: ФИО
//        Если пользователь введет свою фамилию и имя и там будет слово «уулу» вернуть мужчина-кыргыз , а если «кызы» вернуть женщина-кыргыз
//        Если в фамилии и имени будут окончания «ов» и «ев» вернуть мужчина-русский, а если «ова» и «ева» вернуть женщина-русская
//        Если в фамилии и имени не будут уулу, кызы, ов, ев, ова, ева то вернуть «не склоняется фамилия или другая национальность»
//        Для этого изучить дополнительные методы .contains() и endsWith()

            Scanner input = new Scanner(System.in);
            System.out.println("Введите свою фамилию:");
            String surname = input.nextLine();
            boolean female = surname.endsWith("oва") || surname.endsWith("ева");
            boolean male = surname.endsWith("oв") || surname.endsWith("ев");

            if (surname.endsWith("уулу")) {
                System.out.println("мужчина-кыргыз");
            } else if (surname.endsWith("кызы")) {
                System.out.println("женщина-кыргыз");
            } else if (female) {
                System.out.println("женщина русская");
            } else if (male) {
                System.out.println("Мужчина русский");

            } else {
                System.out.println("Другая национальность");
            }

        }
    }
