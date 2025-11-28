package _21_OOP._4_inheritace;

public class Athlete {
    String name;
    int age;


    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void train(){
    }

    public String info(String name,int age){
        return "name:"+name+"age:"+age;
    }
}
