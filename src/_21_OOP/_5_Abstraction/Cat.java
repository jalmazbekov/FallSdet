package _21_OOP._5_Abstraction;

public  class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public  void eat(int time) {
       if (time <= 21){
           System.out.println("рано просыпается");
       }else {
           System.out.println("то поздно");
       }

    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {

    }
}
