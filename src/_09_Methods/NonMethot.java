package _09_Methods;

import java.util.Scanner;

public class NonMethot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите температуру");
        int num = sc.nextInt();
        NonMethot nonMethot = new NonMethot ();
        nonMethot.main2(num);
    }

    public void main2(int num){
        if (num > 30) {
            System.out.println("жарко");
        } else if (num > 15 && num < 30) {
            System.out.println("тепло");
        }else if (num < 15){
            System.out.println("холод");
        }else {
            System.out.println("неверное");
        }

    }
}
