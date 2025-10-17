package _05_if_else_statements;
/*      Пользователь вводит количество баллов от 0 до 100. Программа выводит оценку:
        Если пользователь вводит число в промежутке
        90–100 → «Отлично»
        70–89 → «Хорошо»
        50–69 → «Удовлетворительно»
        ниже 50 → «Неудовлетворительно»*/

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество баллов (0–100): ");
        int pointsBallov = scan.nextInt();

        if (pointsBallov >= 90 && pointsBallov <= 100) {
            System.out.println("Отлично");
        } else if (pointsBallov >= 70 && pointsBallov <= 89) {
            System.out.println("Хорошо");
        } else if (pointsBallov >= 50 && pointsBallov <= 69) {
            System.out.println("Удовлетворительно");
        } else if (pointsBallov >= 0 && pointsBallov < 50) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Ошибка: введите число от 0 до 100");
        }
        scan.close();
    }
}
