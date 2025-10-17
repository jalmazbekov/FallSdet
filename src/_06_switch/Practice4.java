package _06_switch;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //     String season = scan.nextLine();

//        if (season.equals(("Winter"))){
//            System.out.println(1);
//        } else if (season.equals(("Spring"))){
//            System.out.println(2);
//        } else if (season.equals("summer")) {
//            System.out.println(3);
//        } else if (season.equals("fall")){
//            System.out.println(4);
//        } else {
//            System.out.println("this is not a season");
//        }
//        switch (season){
//            case "Winter" :
//                System.out.println(1);
//                break;
//            case "Spring":
//                System.out.println(2);
//                break;
//            case "Summer":
//                System.out.println(3);
//                break;
//            case "Fall":
//                System.out.println(4);
//                break;
//            default:
//                System.out.println("This is not a season");
//        }




//        String greeting = scan.nextLine();
//        String result = "";
//
//        switch (greeting){
//            case "salam":
//               result = "KG";
//                break;
//            case "Privet":
//                result = "RU";
//                break;
//            case "Namaste":
//                result = "Hindu";
//                break;
//            default:
//                result = "do not know the language";
//        }
//        System.out.println(result);





//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//scan.nextLine();
//        String operation = scan.nextLine();
//
//        switch (operation){
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                System.out.println(num1 / num2);
//                break;
//            default:
//                System.out.println("error");
//        }




        switch (9){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("not number");
        }

    }
}