package _07_string;

public class String1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str1.hashCode());
        System.out.println(str1 == str2);

        String str7 = new String("hello");
        System.out.println(str7.hashCode());

        System.out.println(str7 == str3);
    }
}
