package _09_Methods;

import java.util.Scanner;

public class NonStaricMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("введите погоду");
        int num =  input.nextInt();

        NonStaricMethod obj = new NonStaricMethod();
        obj.pogoda(num);

    }

    public void pogoda(int number){
        if (number > 30){
            System.out.println("жарко");
        } else if (number >= 15 && number < 30) {
            System.out.println("тепло");
            
        }else if (number < 15){
            System.out.println("холод");
        }else {
            System.out.println("введите коректную погоду");
        }


    }
}
