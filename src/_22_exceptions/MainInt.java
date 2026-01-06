package _22_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите число для joma: ");
            int a = sc.nextInt();

            System.out.print("Введите число для azat: ");
            int b = sc.nextInt();

            int nums = joma(a) / azat(b);
            System.out.println("try: результат = " + nums);

        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль!");

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно вводить только числа!");

        } finally {
            System.out.println("finally");
        }
    }

    public static int joma(int num) {
        return num;
    }

    public static int azat(int num) {
        return num;
    }
}
