package Ramen;

public class TaskCyclos {
    public static void main(String[] args) {
        lesson2();
        lesson2();



    }

    public static void lesson1() {
        //1. Вывести числа от 1 до 10
        //Выведи каждое число на новой строке.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void lesson2() {
        //3. Вывести все чётные числа от 2 до 20
        //
        //Используй for.
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Аяна туура эмес кылды");
            }
        }
    }


}
