package _21_OOP._4_inheritace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeroMain {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        System.out.println(heroes);
        heroes.add(new Warrior("conan",80));
        heroes.add(new Mage("naruto",100000));

       for(Hero hero: heroes){
           hero.usePower();
           hero.info();
       }

    }
}
