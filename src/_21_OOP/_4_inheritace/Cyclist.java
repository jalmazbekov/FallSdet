package _21_OOP._4_inheritace;

public class Cyclist  extends Athlete{
    public Cyclist(String name, int age) {
        super(name, age);
    }


    @Override
    public void train() {
        System.out.println("Cyclist бежит 20км");
    }


    public void train(int hours) {
        System.out.println("Cyclist бежит 20 км в течение " + hours + " часов");
    }




}
