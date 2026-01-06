package _22_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dpo44 {
    public static void main(String[] args) {
        //попросить пользователя вести  имя
        // и обработать это исключение

        Scanner scan = new Scanner(System.in);
        System.out.println("введите возраст");

        try {
            int age = scan.nextInt();
            System.out.println(age);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }

        System.out.println("vfdcs");
    }
}
