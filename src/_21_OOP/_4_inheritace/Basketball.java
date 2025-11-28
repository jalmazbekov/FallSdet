package _21_OOP._4_inheritace;

public class Basketball extends Sport{

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public String dream() {
        return "Dream:  Стать крутым баскетболистом";
    }
}
