package _21_OOP._5_Abstraction;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void eat(int time);

    public abstract void sleep();

    public abstract void voice();
}
