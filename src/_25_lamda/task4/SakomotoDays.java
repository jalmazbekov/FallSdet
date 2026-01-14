package _25_lamda.task4;

import java.util.function.Predicate;

public class SakomotoDays {
    public static void main(String[] args) {

        Predicate  <String> predicate = str -> str.equals("sako");
        System.out.println(predicate.test("sako"));


    }
}
