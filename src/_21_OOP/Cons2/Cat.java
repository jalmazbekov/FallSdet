package _21_OOP.Cons2;

public class Cat {
    String name;
    int age;
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
