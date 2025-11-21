package Ramen;
import javax.swing.*;

public class CycleWhile {
    public static void main(String[] args) {
        JFrame okno = new JFrame();     // создаём окно
        okno.setSize(200, 100);         // размер окна

        JLabel text = new JLabel("Привет!", SwingConstants.CENTER); // текст

        okno.add(text);                 // добавляем текст в окно
        okno.setVisible(true);          // показать окно
    }
}
