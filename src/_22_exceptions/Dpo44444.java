package _22_exceptions;

import java.util.Scanner;

public class Dpo44444 {
    public static void main(String[] args) {

        double userBalance = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("ваш баланс " + userBalance);

        try {
            double item = Double.parseDouble(input.nextLine());
            if (item < userBalance) {
                System.out.println("success");
            }else if (item == 0){
                System.out.println("item cannot be to 0 som");
            }
        }catch (Exception e){
            System.out.println("введите коректнре число");
            e.printStackTrace();
        }finally {
            System.out.println("обратботае");
        }

        System.out.println("пиамвсзщ");

    }
}
