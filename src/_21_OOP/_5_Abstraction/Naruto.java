package _21_OOP._5_Abstraction;

public abstract class Naruto {
    String name;
    int age;

    public Naruto(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void sleep();

    @Override
    public String toString() {
        return "Naruto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
