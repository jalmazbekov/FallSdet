package _09_Methods;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        num1();
        Scanner sc = new Scanner(System.in);
        System.out.println("введите ваше имя:");

    }

    public static void num1(){

        int num = 50;
        if (num > 59){
            System.out.println("больше 50");
        }else if (num == 50){
            System.out.println("они равны");
        }else {
            System.out.println("eror");
        }
    }

    public static void num2(String name){
        String sc = new Scanner(System.in).next();


    }
}


