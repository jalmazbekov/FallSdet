package _09_Methods;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your уйвйц");
        int name = sc.nextInt();
        kvartal(name);

        kvartal2();

    }

    public static void kvartal(int number) {
        switch (number) {
            case 1:
                System.out.println(" квартал1");
                break;
            case 2:
                System.out.println("первыуй 22квартал");
                break;
            case 3:
                System.out.println("первый 33квартал");
                break;
            case 4:
                System.out.println("первый 44квартал");
                break;
            default:
                System.out.println("в году евсть 4 кварталов");
        }

    }

    public static void kvartal2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер квартала");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("первый квартал");
        }else if (number == 2){
            System.out.println("второй кваратл");
        }else if (number == 3){
            System.out.println("третий квартал");
        }else if (number == 4){
            System.out.println("четвертый квартал");
        }else {
            System.out.println("в году только 4 квартала");
        }

    }
}
