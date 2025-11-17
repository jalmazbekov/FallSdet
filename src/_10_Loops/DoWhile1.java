package _10_Loops;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
//        int number = 10;
//        do {
//            number--;
//            System.out.println(number);
//
//        }while (
//                number > 0
//        );


//        // 12 -24
//        System.out.println("\n------------------");
//        int number1 = 12;
//        do {
//            if (number1 % 2 != 0) {
//                System.out.println(number1);
//            }
//            number1++;
//        }
//    while(number1 <= 24);
//

// бюджет = 1000
// 400 -> 600
// 20 -> 580
// 180 -> 400
// 360 -> 40
// 100 -> недостаточно средств  40 -> 0  0 -> выход


        shopping();

    }

    public static void shopping() {
        Scanner input = new Scanner(System.in);

        int budget = 1000;

        while (true) {
            System.out.println("Введите сумму покупки:");
            int spent = input.nextInt();

            if (spent < budget) {
                budget = budget - spent;
                System.out.println("Спасибо за покупку, Аяна!");
                System.out.println("Ваш остаток: " + budget);
            } else if (spent == budget) {
                System.out.println("Ваша покупка за последние деньги, Аяна!");
                System.out.println("Баланс теперь 0.");
                break; // завершаем, так как денег больше нет
            } else if (spent > budget) {
                System.out.println("Акча жетпейт, у вас всего: " + budget);
                break;
            } else {
                System.out.println("Неверные данные!");
            }
        }

    }
    }

