package _21_OOP._6_Interface;

public class Bike implements Transport {
    @Override
    public void name() {
        System.out.println("Мотоцикл — не мечта");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл резко остановился");
    }
}
