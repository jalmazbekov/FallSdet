    package _25_lamda.task1;

    public class DemoGreeting {
        public static void main(String[] args) {


              Greeting greeting = (name -> System.out.println("hello " + name + "  !"));
              greeting.sayHello("joma");
              greeting.sayHello("sardar ");


              MathOperation math = (a, b) -> a + b;
              System.out.println(math.operator(2,66));
              System.out.println(math.operator(4,33));
              System.out.println(math.operator(7,33));


              MathOperation math1 = (a, b) -> a * b;
              System.out.println(math1.operator(88,66));
              System.out.println(math1.operator(35,93));

                System.out.println("-------");

             StringCheck print = input -> input.length() > 5;
             System.out.println(print.check("hjdd"));
                System.out.println(print.check("букв"));
                System.out.println(print.check("инкасатор"));
              System.out.println(print.check("наследлование"));
              System.out.println(print.check("hjddвв"));



            StringCheck containsPrint = input -> input.contains("a");
            System.out.println(containsPrint.check("aaaa"));
            System.out.println(containsPrint.check("ergfvg  "));
        }
    }
