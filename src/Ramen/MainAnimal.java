package Ramen;

public class MainAnimal {
    public static void main(String[] args) {
        // Добавляем параметры при создании объектов
        Animal animal = new Animal("Животное", "серый", 3);
        Dog dog = new Dog("Шарик", "черный", 5);
        Cat cat = new Cat("Мурка", "белый", 2);

        // Выводим информацию о животных
        System.out.println(animal);
        System.out.println(dog);
        System.out.println(cat);
    }
}