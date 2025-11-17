package _07_string;

public class StringMethods2 {
    public static void main(String[] args) {
        // contains метод ко торый проверяет  есть ли в этом строке этот текст boolean
        System.out.println("hadiller".contains("fsda"));

        //charAt возвращает символьный тип данных
        String str = "hadiller";
        System.out.println(str.charAt(4));


        //concat  соединяет строки
        String info = "java ";
        System.out.println(info.concat("qa automation"));

        //endWith  проверяет   начиная с последних букв
        String str2 = "уауauto";
        System.out.println(str2.endsWith("auto"));

        //startWith проверяет начиная с начальных букв
        String str3 = "satoru mirerjvlrekds";
        System.out.println(str3.startsWith("satoru"));

        String str4 = "i joma naim  joma ";
        System.out.println(str4.startsWith("i love joma "));

        //trim  обрезает обе стороны     лишние пробелы
        String str5 = "      joma      ayana       ";
        System.out.println(str5.trim());

        //substring начиная с  конктретного   индекса   выводит !! есть два вида один  только начиная
        // а другой начиная и  до    определенного индекса
        String str6 = "programma";
        System.out.println(str6.substring(0,5));


        //contains
        System.out.println("joma".contains("az ma"));



    }
}
