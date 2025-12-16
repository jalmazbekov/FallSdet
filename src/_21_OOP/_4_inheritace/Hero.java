package _21_OOP._4_inheritace;

public class Hero {
    private  String name;
    private  int power;


    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void usePower(){
        System.out.println("Hero use power");
    }

    public void info(){
        System.out.println("name"+name +"power"+power );
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
