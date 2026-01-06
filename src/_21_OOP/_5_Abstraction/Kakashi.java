package _21_OOP._5_Abstraction;

public class Kakashi extends Naruto {

    public Kakashi(String name, int age) {
        super(age, name);


    }

    @Override
    public void sleep() {
        System.out.println(name +"где то на задании");
    }

    @Override
    public String toString() {
        return "Kakashi{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

