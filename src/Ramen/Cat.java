package Ramen;

// Cat должен наследоваться от Animal, а не от Dog
public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}