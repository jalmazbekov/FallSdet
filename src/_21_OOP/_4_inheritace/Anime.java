package _21_OOP._4_inheritace;

public class Anime {
    String name;
   private int age;

    public Anime(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void SuperPower(){
        System.out.println("Super Power");
    }

    @Override
    public String toString() {
        return "Anime{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
