package _21_OOP._4_inheritace;

public class Participant {
    protected String name;
    protected int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Participant(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Name: \t\t\t "+name + "\nAge: \t\t\t "+age);
    }
}
