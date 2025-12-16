package _21_OOP._4_inheritace;

public class Student extends Participant {
    private String university;
    private int mark;


    public Student(String name, int age, String university,int mark) {
        super(name, age);
        this.university = university;
        this.mark = mark;
    }




    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("university: \t\t\t" + university+ "\nMark: \t\t\t" + mark);
    }
}
