package _21_OOP._5_Abstraction;

public abstract class Transport {
    protected int speed;

    public Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();
}
