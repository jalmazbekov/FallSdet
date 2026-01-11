package _25_lamda.task2;

import java.util.function.Function;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> num = isnum -> isnum > 3;

        System.out.println(num.test(5));   // true
        System.out.println(num.test(-3));  // false
        checkNumber(3);
        printLength("dscf");
    }

    static void checkNumber (int x){
        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println(isPositive.test(x));

    }


    static void printLength(String s){
        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply(s));
    }
}
