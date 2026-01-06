package _21_OOP._6_Interface;

public class MainTrans {
    public static void main(String[] args) {

        Transport car = new Car();
        Transport bike = new Bike();

        car.name();
        car.stop();


        System.out.println("===");
        bike.name();
        bike.stop();
    }
}
