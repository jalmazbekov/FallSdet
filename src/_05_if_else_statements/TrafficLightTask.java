package _05_if_else_statements;

import java.util.Scanner;

public class TrafficLightTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Вы возле светофора\nВведите цвет, который вы видите:");
        String name = input.next().toLowerCase();

        if (name.equals("желтый") || name.equals("зеленый")) {
            System.out.println("проходи");
        } else if (name.equals("красный")) {
            System.out.println("stop");
        } else {
            System.out.println("error");
        }

        input.close();
    }
}
