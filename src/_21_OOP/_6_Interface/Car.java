package _21_OOP._6_Interface;

public class Car implements Transport {
    @Override
    public void name() {
        System.out.println("ауди моя мечта");
    }


    @Override
    public void stop() {
        System.out.println("Ауди плавно остановилась");
    }
}
