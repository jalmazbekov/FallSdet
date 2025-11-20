package _21_OOP._3_Encapsulation;

public class PersonMain {
    public static void main(String[] args) {
        Person obj = new Person("adilet",'m');
        System.out.println(obj);
        System.out.println(obj.name);
        System.out.println("_________-");
        System.out.println(obj.gender);

        obj.check_gender(obj);
    }
}
