package _04_scanner;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите ваш возраст");
        int num = scan.nextInt();

        System.out.println("ВЕДИТЕ СВОЕ ИМЯ");
        String name = scan.nextLine();

        System.out.println(num + " " + name);




    }
}
