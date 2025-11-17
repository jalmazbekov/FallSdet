package _21_OOP.Cons;

public class Person {
    String name;
    String email;
    String phone;
    String address;
    String city;
    String lastName;
    int age;

    public Person(String address, int age, String city, String phone, String name, String lastName, String email) {
        this.address = address;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Person(String name, String lastName, String email, String city, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "люди семьи{" +
                "address'" + address + '\'' +
                ", name'" + name + '\'' +
                ", email'" + email + '\'' +
                ", phone'" + phone + '\'' +
                ", city'" + city + '\'' +
                ", lastName'" + lastName + '\'' +
                ", age   =" + age +
                '}';
    }
}
