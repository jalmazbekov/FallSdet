package _21_OOP._4_inheritace;

public class OnePunchMan extends   Anime {
    public OnePunchMan(String name, int age) {
        super(name, age);
    }

    public void otherHero(){
        System.out.println("Генос");
    }  public void otherHero1(){
        System.out.println("Сайтама");
    }  public void otherHero2(){
        System.out.println("Татсумаки");
    }  public void otherHero3(){
        System.out.println("Фубуки");
    }  public void otherHero4(){
        System.out.println("Момо́н");
    }  public void otherHero5(){
        System.out.println("Кинг");
    }  public void otherHero6(){
        System.out.println("Зомбигодзила");
    }  public void otherHero7(){
        System.out.println("Гарou");
    }  public void otherHero8(){
        System.out.println("Carnage");
    }  public void otherHero9() {
        System.out.println("Вакандо");
    }

    @Override
    public void SuperPower() {
        System.out.println("");
    }
}
