package _09_Methods;

import java.util.Scanner;

public class Lesson1  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        main1(name);

    }

    public static void main1(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            System.out.println("звони" + phoneNumber);
        }else {
            System.out.println("не звони");
        }

    }
}