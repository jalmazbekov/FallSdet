package _25_lamda.task2;

import java.util.function.Predicate;

public class EmailMain {
    public static void main(String[] args) {

        Email obj  = new Email("s...dko@vso");
        Predicate<Email> isContainDog = mail -> mail.email.contains("@");
        Predicate<Email> idContainDog = mail -> mail.email.contains(".");

        System.out.println(isContainDog.test(obj));
        System.out.println(idContainDog.test(obj));

        System.out.println("-----------------");

        Predicate<Email> dotBeforeDog = mail -> {
          boolean b =   mail.email.indexOf("@") == mail.email.indexOf(".")  + 1;
          return b;
        };
        System.out.println(dotBeforeDog.test(obj));
    }
}
