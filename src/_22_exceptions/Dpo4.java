package _22_exceptions;

import java.util.Scanner;

public class Dpo4 {
    public static void main(String[] args) {

        System.out.println("rtyvuginlm;");
        System.out.println("rtyvuginlm;");

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int num = scanner.nextInt();

        try {
            System.out.println(10 /num);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("rtyvuginlm;");
    }
}
