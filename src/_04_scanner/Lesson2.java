package _04_scanner;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("введите свое имя:");
        String name = scan.nextLine();

        System.out.println("Введите свой возраст:");
        int age = scan.nextInt();

        System.out.println("введите свой рост:");
        int num  = scan.nextInt();


        System.out.println("Вас зовут: "+ name + " вас возраст "+ age + " ваш рост состовляет:" + num);

    }

}
