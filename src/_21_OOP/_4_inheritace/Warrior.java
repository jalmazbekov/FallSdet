package _21_OOP._4_inheritace;

public class Warrior extends Hero{
    public Warrior(String name, int power) {
        super(name, power);
    }

    @Override
    public void usePower() {
        System.out.println("Наносит удар мечом!");
    }

}
    