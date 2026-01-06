package _22_exceptions;

public class Task3_4 {
    public static void main(String[] args) throws Exception {
        try {
            check_even_numbers(11);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("нурай я тебя люблю");


    }
    public static void check_even_numbers(int num) throws Exception{
        if (num % 2 != 0){
            throw new RuntimeException(num + " is not even");
        }else {
            System.out.println(num + " is even number");
        }
    }
}
