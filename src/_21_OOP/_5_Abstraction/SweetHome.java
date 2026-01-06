package _21_OOP._5_Abstraction;

public class SweetHome extends Dorama {


    public SweetHome(int totalNumberOfPeople, String mainActor) {
        super(totalNumberOfPeople, mainActor);
    }

    @Override
    public void seasons() {
        System.out.println("Милом доме 3 сезона");
    }

    @Override
    public void series() {
        System.out.println("в милом доме  около 60сериии");

    }
}
