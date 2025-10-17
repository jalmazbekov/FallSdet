package _05_if_else_statements;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите число  от 10 до 100:");
        int age = input.nextInt();
        if (age < 100 & age > 80) {
            System.out.println("круто первый класс");
        } else if (age < 80 && age > 50) {
            System.out.println("норм второй класс");
        }else if (age < 50 && age > 30){
            System.out.println("третий класс пойдет");
        } else if (age < 30 || age < 10) {
            System.out.println("четвертый класс слабо");
        } else if (age < 10 && age > 1)  {
            System.out.println("последний");
        }else {
            System.out.println(false);
        }
    }
}
