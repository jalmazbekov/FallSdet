package _21_OOP._5_Abstraction;

public abstract class Krd {
    String name;
    int age;

    public Krd(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  abstract void power();

    public  abstract void sleep();
}
