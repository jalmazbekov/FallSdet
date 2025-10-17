package _04_scanner;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        if (firstName.length() == 10){
            System.out.println("не годен");
        }else if (firstName.length() > 8){
            System.out.println("годен");
        }else {
            System.out.println("сиди дома");
        }
    }
}
