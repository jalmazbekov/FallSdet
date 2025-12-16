package _21_OOP._4_inheritace;

public class Draft {
    String name;
    int age;

    public Draft(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {

    }

   void sleep() {

    }

    @Override
    public String toString() {
        return "Draft{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
