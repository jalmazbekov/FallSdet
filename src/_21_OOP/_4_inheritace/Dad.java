package _21_OOP._4_inheritace;

public class Dad {
    String name;
    private int age;

    public Dad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void draw() {
        System.out.println("Drawing....");
    }

    @Override
    public String toString() {
        return "Dad{" +
                ", name='" + name + '\'' +
                "age=" + age +
                '}';
    }
}
