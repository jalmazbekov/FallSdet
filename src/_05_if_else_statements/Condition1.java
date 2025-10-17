package _05_if_else_statements;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите возраст:");
        int age = input.nextInt();
        System.out.println("есть билет :");
        String name = input.next();
        if ((age >= 18) && (name.equals("да") || (name.equals("yea")))) {
            System.out.println("можно идти в кино");
        } else {
            System.out.println("вам нельзя одному");
        }

    }
}
