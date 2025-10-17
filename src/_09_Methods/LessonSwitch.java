package _09_Methods;

import java.util.Scanner;

public class LessonSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        String name = sc.nextLine();
        main1(name);

    }

    public static void main1(String name) {
        switch (name ){
            case "1":
                System.out.println("ПЕРВЫЙ квартад");
                break;
            case "2":
                System.out.println("второй квартал");
                break;
            case "3":
                System.out.println("третий квартал");
                break;
            case "4":
                System.out.println("четвертый квартал");
                break;
                default:
                    System.out.println("в году есть 4 квартала");
        }



    }
}
