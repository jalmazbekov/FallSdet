package Ramen;

public class Animal {
    String name;
    String color;
    int age;

    // Исправленный конструктор - добавляем инициализацию age
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age; // Добавлена эта строка
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}