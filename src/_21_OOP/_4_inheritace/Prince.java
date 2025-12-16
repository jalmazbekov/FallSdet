package _21_OOP._4_inheritace;

public class Prince  extends  King{
    public Prince(String name, int age) {
        super(name, age);
    }

    @Override
    public void coronation() {
        System.out.println("Coronation to Prince in progress...");
    }
}
// не наследуется:
// 1. constructor
// 2. private method

