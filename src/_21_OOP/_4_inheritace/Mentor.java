package _21_OOP._4_inheritace;

public class Mentor extends Participant{
    private int year;

    public Mentor(String name, int age, int year) {
        super(name, age);
        this.year = year;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("year: \t\t\t " + year);
    }















}
