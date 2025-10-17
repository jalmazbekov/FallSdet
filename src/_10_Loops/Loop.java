package _10_Loops;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        login();
//        если логин правильный
//        запросить пароль
//        если не правильный запросить еще 2 попытки
//                Scanner
//        if else
//        цикл фор
//        если не правильный eror
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        String login = "hazim";
        String password = "qwerty";
        for (int i = 6; i >= 1; i--) {
            System.out.println("Ведите свой ник на страницу");
            String username = input.nextLine();
            if (username.equals(login)) {
                for (int j = 3; j >= 1 ; j--) {
                    System.out.println("введите пароль");
                    String password1 = input.nextLine();
                    if (password1.equals(password)) {
                        System.out.println("Welcome " + username);
                        return;
                    } else {
                        System.out.println("у вас осталось не сколько попыток" + (j - 1));
                    }

                }
                System.out.println("у вас больше не осталось попыток: Повторите позже");
                return;
            } else {
                System.out.println(" осталось попыток:" + (i -1));
            }


        }
    }
}

