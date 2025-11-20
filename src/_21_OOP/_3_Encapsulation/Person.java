package _21_OOP._3_Encapsulation;

public class Person {
    //Access modifiers
    // 1 public
    // 2 protected
    // 3 default
    // 4 privet

   protected String name;
   protected   char gender;

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void  check_gender(Person person){
        if (person.gender == 'f'){
            System.out.println("Female");
        } else if (person.gender == 'm') {
            System.out.println("Male");
        }else {
            System.out.println("Unsupported gender");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
