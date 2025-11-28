package _21_OOP._4_inheritace;

public class Son extends  Dad {
    public  Son(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void draw() {
        System.out.println("Аяна окууу ");
    }
}
