package _21_OOP._5_Abstraction;

public class MainDorama {
    public static void main(String[] args) {
        Dorama d1 = new SweetHome(3,"Song Kang");
        d1.seasons();
        d1.series();
        System.out.println("--------------");

        Dorama taxiDeluxe = new TaxiDeluxe(2,"Kim do gi");
        taxiDeluxe.series();
        taxiDeluxe.seasons();
        System.out.println(taxiDeluxe);
    }
}
