package _09_Methods;

import java.util.Scanner;

public class Lesson2332 {
    public static void main(String[] args) {

    }


    public static void test(){

        System.out.println("hi");
    }

    public static void test1(String name){
        System.out.println("hello" + name);
        System.out.println("hello" + name);
        System.out.println("hello" + name);


    }
    public static void to_call(String phoneNumber){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String number = input.nextLine();
        if (phoneNumber.length() == 12){
            System.out.println("звоним" + phoneNumber);
        }else if (phoneNumber.length() < 11 || phoneNumber.length() > 12){
            System.out.println("такого номера не сущетсвцкет");
        }



    }

}
