package _04_scanner;

import java.util.Scanner;

public class DzConsoleAnketa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Привет пользователь консоли! Я задам вопросы для заполнения анкеты. Если ты согласен, нажми (Enter)");
        scan.nextLine();

        System.out.print("Имя пользователя: ");
        String name = scan.nextLine();

        System.out.println("Хорошо, " + name + ". Давай продолжим? Нажми (Enter)");
        scan.nextLine();

        System.out.print("Фамилия: ");
        String surname = scan.nextLine();

        System.out.print("Дата рождения: ");
        String dateBirth = scan.nextLine();

        System.out.print("Телефон номер: ");
        String phoneNumber = scan.nextLine();

        System.out.print("Ваш email (почта): ");
        String userEmail = scan.nextLine();

        System.out.print("Рост, вес и возраст пользователя: ");
        String userInformation = scan.nextLine();

        System.out.println("\nПредпочтительный способ получения информации:");
        System.out.printf("%-10s %-15s %-10s%n", "1) SMS", "2) Телефон", "3) E-mail");
        System.out.print("Ваш выбор (1-3): ");
        String choice = scan.nextLine();

        System.out.print("Номер карты пользователя: ");
        String cardNumber = scan.nextLine();

        System.out.print("Дата выдачи карты: ");
        String cardIssueDate = scan.nextLine();

        System.out.println("Примечание пользователя (обязательное поле для заполнения): ");
        String userNote = scan.nextLine();

        System.out.println("\n Анкета которую вы заполнили");
        System.out.printf("%-20s: %s%n", "Имя", name);
        System.out.printf("%-20s: %s%n", "Фамилия", surname);
        System.out.printf("%-20s: %s%n", "Дата рождения", dateBirth);
        System.out.printf("%-20s: %s%n", "Телефон", phoneNumber);
        System.out.printf("%-20s: %s%n", "E-mail", userEmail);
        System.out.printf("%-20s: %s%n", "Рост/вес/возраст", userInformation);
        System.out.printf("%-20s: %s%n", "Номер карты", cardNumber);
        System.out.printf("%-20s: %s%n", "Дата выдачи карты", cardIssueDate);
        System.out.printf("%-20s: %s%n", "Примечание", userNote);

        scan.close();
    }
}
