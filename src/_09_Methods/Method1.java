package _09_Methods;

public class Method1 {
    public static void main(String[] args) {
        main1();
        main2("joma");
        main2("azat");
        main2("joomart");
        main2("beka");
        main3(10000);
    }

    public static void main1() {
        System.out.println("Hello World");

    }

    public static void main2(String name) {
        System.out.println("hello " + name+  "!");

    }

    public static void main3(int course) {
        float kgKousr = 87.5f;
        float result = course / kgKousr;
        System.out.println("result is " + result);

    }
}
