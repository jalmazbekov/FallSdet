package _21_OOP._5_Abstraction;

public class Bicycle extends Transport {

    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед едет со скоростью " + speed + " км/ч");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                '}';
    }
}
