package _23_enums;

public class PrintSeasons {
    public static void main(String[] args) {

        MySeasons mySeasons =MySeasons.WINTER;

        switch (mySeasons){
            case WINTER ->   System.out.println("WINTER");
            case SPRING -> System.out.println("SPRING");
            case SUMMER -> System.out.println("SUMMER");
            case AUTUMN ->  System.out.println("AUTUMN");

        }
    }
}
