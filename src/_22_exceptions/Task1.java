package _22_exceptions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        try {
            int nums [] = {11,55,33,99};
            System.out.println(nums[i]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
            System.out.println("поток данных завершен");
        }

        System.out.println("hgdjfsaksfvdeokid");


        try {
            String name = sc.nextLine();
            System.out.println(name);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("fksjdcdvjfhejd");


    }
}
