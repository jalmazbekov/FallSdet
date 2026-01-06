package _22_exceptions;

import java.util.Scanner;

public class Dpo4444 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите число ");
        int num  = 0;
        while (true) {

            try {
                num = Integer.parseInt(input.nextLine());
                break;
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("финальная обработка");
            }

        }


        System.out.println("fnjsdvnkxml");
    }
}



























