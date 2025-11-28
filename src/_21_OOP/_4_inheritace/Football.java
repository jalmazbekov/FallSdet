package _21_OOP._4_inheritace;

public class Football extends Sport{

    public Football(String name, int age) {
        super(name, age);
    }

    @Override
    public String dream() {
        return "Dream:  стать крутым футболистом";
    }
}
