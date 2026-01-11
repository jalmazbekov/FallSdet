package _24_date_time;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Task2 {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Bishkek"));
        System.out.println("Время в Бишкеке: " + zonedDateTime);
    }
}
