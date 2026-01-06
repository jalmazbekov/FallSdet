package _22_exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        try {
            int nums [] = {33,33,22,3};
            System.out.println(nums[i]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Done");
        }

        System.out.println("terfvdasdvfd gfdbv");
    }
}
