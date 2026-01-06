package _21_OOP._5_Abstraction;

public abstract class Dorama {
    protected String mainActor;
    protected int totalNumberOfPeople;


    public Dorama(int totalNumberOfPeople, String mainActor) {
        this.totalNumberOfPeople = totalNumberOfPeople;
        this.mainActor = mainActor;
    }

    public abstract void seasons();
    public abstract void series();

    @Override
    public String toString() {
        return "Dorama{" +
                "mainActor='" + mainActor + '\'' +
                ", totalNumberOfPeople=" + totalNumberOfPeople +
                '}';
    }
}
