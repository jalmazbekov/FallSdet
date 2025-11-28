package Ramen;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + color + age;
    }
}