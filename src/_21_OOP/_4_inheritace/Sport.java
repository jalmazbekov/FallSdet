package _21_OOP._4_inheritace;

public abstract class Sport {
    String name;
    int age;
    public Sport(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String dream(String text){
        return "Dream: " + text;

    }

    public abstract String dream();
}
