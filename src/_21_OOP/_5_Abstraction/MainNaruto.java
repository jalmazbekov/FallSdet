package _21_OOP._5_Abstraction;

public class MainNaruto {
    public static void main(String[] args) {

       Hinata hinata  = new Hinata("Хината", 18);
       hinata.sleep();
        System.out.println(hinata);
        System.out.println("--------------------");
        Kakashi kakashi = new Kakashi("6хокаге", 33);
        kakashi.sleep();
        System.out.println(kakashi);

    }
}
