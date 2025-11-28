package _21_OOP._4_inheritace;

public class Runner extends Athlete {

    public Runner(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println(name + " бежит 5 км");
    }

    // Перегруженный метод с параметром
    public void train(int hours) {
        System.out.println(name + " бежит 5 км в течение " + hours + " часов");
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
