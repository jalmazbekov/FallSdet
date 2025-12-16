package _21_OOP._4_inheritace;

public class Draft2 extends Draft {

    public Draft2(String name, int age) {
        super(name, age);
    }


    @Override
        public void eat() {
            System.out.println("azat almazbekov");
    }


    void sleep(String name) {
        System.out.println("ее зовут" + name + "  и она хочет спать");
    }
}
