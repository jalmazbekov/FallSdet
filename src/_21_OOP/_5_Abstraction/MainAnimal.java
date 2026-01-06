package _21_OOP._5_Abstraction;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob","black",4);
        System.out.println(dog);

        dog.voice();

        dog.sleep();



        Cat cat = new Cat("Koтик","white",2);
        System.out.println(cat);
        int time = 22;
        cat.sleep();

    }
}
