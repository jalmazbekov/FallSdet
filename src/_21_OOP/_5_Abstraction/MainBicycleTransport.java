package _21_OOP._5_Abstraction;

public class MainBicycleTransport {
    public static void main(String[] args) {
        Car car = new Car(180);
        car.move();
        System.out.println("Скорость машины: " + car.getSpeed() + " км/ч");

        System.out.println("---------------");

        Bicycle bicycle = new Bicycle(55);
        bicycle.move();
        System.out.println("Скорость велосипеда: " + bicycle.getSpeed() + " км/ч");
    }
}



