package _22_exceptions;

import java.util.Scanner;

public class Dpo444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите имя");
        String name = sc.nextLine();

        try {
            int n = Integer.parseInt(name);
            System.out.println("вы вели число в место имени: "+ n);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("финал");
        }
        System.out.println("tuerjiowvdcp");
    }
}
