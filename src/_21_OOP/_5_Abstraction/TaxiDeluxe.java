package _21_OOP._5_Abstraction;

public class TaxiDeluxe extends  Dorama{


    public TaxiDeluxe(int totalNumberOfPeople, String mainActor) {
        super(totalNumberOfPeople, mainActor);
    }

    @Override
    public void seasons() {
        System.out.println("на такси делюкс   2 сезона");

    }

    @Override
    public void series() {
        System.out.println("в такси делюкс около    45серии");
    }
}
