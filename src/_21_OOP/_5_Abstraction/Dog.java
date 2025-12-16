package _21_OOP._5_Abstraction;

public class Dog extends Animal{


    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat(int time) {
        System.out.println("кушает косточки");

    }

    @Override
    public void sleep() {
        System.out.println("мало спит");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("гав-гав");



    }
}
