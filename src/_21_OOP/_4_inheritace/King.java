package _21_OOP._4_inheritace;

public class King {
    protected String title = "Prince";
    protected final String prince_title = "Prince";
    protected final String king_title = "King";
    private int age;
    protected String name;

    public King(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show_current_title() {
        System.out.println(title);

    }

    public void coronation() {
        if (prince_title.equalsIgnoreCase(title)) {
            change_title(king_title);
        }
        System.out.println("Coronation to King in progress...");
    }

    private void change_title(String title) {
        this.title = title;
        System.out.println(title);
    }

}
