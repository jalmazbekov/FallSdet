package _11_arra;

import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        //             0  1  2 3
        int [] num = {12,23,34,345,};
        num [0] = 14;
        num [1] = 15;
        System.out.println(num[0]   +     num[2]);



        System.out.println("-------------");
        int [] num2 = new int[8];
        num2 [7] = 22;
        System.out.println(Arrays.toString(num2));
    }
}
