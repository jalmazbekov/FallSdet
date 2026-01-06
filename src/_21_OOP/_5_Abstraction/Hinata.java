package _21_OOP._5_Abstraction;

public class Hinata extends Naruto{
    public Hinata(String name, int age) {
        super(age, name);
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит");
    }


    @Override
    public String toString() {
        return "Hinata{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
