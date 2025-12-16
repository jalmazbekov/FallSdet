package _21_OOP._4_inheritace;

public class Mage extends  Hero{
    public Mage(String name, int power){
        super(name,power);
    }

    @Override
    public void usePower() {
        System.out.println("Маг использует заклинание!");
    }
}
