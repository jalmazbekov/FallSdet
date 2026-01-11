package _25_lamda.task2;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {

        // predicate
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(2));

        Predicate<Integer> isNegative = num -> num % 2 == 0;
        System.out.println(isNegative.test(7));

        Predicate<Integer> isSmail = num -> num < 100;
        System.out.println(isSmail.test(99));

        Predicate<Integer> result = isPositive.and(isSmail).and(isSmail.negate());
        System.out.println(result.test(2));

        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.negate().test("e"));

        Predicate<String> isContains = str -> str == null;
        //

        Predicate<String> result2 = isContains.or(isEmpty);
        System.out.println(result2.test("jj"));
        //function
        //Consumer



    }
}
