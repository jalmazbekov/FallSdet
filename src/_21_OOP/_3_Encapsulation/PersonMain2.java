package _21_OOP._3_Encapsulation;

public class PersonMain2 {
    public static void main(String[] args) {
        Person obj = new Person("James", 'm');
        System.out.println(obj);
        System.out.println(obj.name);
        System.out.println("___");
        System.out.println(obj.gender);

        obj.check_gender(obj);
    }
}
