package _22_exceptions;

import java.util.Scanner;

public class NegNumber2Ex {
    public static void main(String[] args) throws NegativeNumber {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int inputNumber = input.nextInt();

        if (inputNumber >= 0) {
            System.out.println("число принято в обработку");
        } else {
            throw new NegativeNumber(inputNumber, "является негативным числом");
        }
    }
}
