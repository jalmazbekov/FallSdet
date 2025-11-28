package _21_OOP._4_inheritace;

public class Swimmer extends Athlete {

    public Swimmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println("Swimmer бежит 10км");
    }

    public void train(int hours) {
        System.out.println("Swimmer бежит 10км в течение:" + hours + "часов");
    }

}
