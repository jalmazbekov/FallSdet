package _21_OOP._5_Abstraction;

public class Car extends Transport {

    public Car(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Машина едет со скоростью " + speed + " км/ч");
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
