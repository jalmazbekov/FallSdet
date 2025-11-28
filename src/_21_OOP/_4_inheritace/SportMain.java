package _21_OOP._4_inheritace;

public class SportMain {
    public static void main(String[] args) {
        Football football = new Football("Рональдо", 40);
        System.out.println(football);
        System.out.println(football.dream());


        Basketball basketball = new Basketball("Azat",20);
        System.out.println(basketball);
        System.out.println(basketball.dream());
        basketball.dream();

        System.out.println("________");
        Volleyball volleyball = new Volleyball("Джеймс", 33,"Almazbekov");
        System.out.println(volleyball); // toString() из Sport


    }
}
