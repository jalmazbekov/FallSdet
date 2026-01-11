package _24_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {
        //local date >  2025 -12-17
        // local time -> 10:13:08
        // localDateTime -> 2025-12-17T10:13:59

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2007,07,14);
        System.out.println(date);

        System.out.println("-------------");
        LocalTime time = LocalTime.of(10,2,2);
        System.out.println(time);

        System.out.println("--------------------------");

        LocalDateTime dateTime = LocalDateTime.of(2007,07,14,10,2);
        System.out.println(dateTime);
        System.out.println("----------");


        LocalDate date1 = LocalDate.now();



        System.out.println(date1.getYear());

        System.out.println(date1.getMonth());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());

    }
}
