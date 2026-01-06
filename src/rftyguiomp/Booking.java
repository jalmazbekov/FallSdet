//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//
//public class Booking {
//
//    private String user_name;
//    private LocalDateTime start_time;
//    private LocalDateTime end_time;
//
//    public Booking(String user_name, LocalDateTime start_time, LocalDateTime end_time) {
//        this.user_name = user_name;
//        this.start_time = start_time;
//        this.end_time = end_time;
//    }
//
//    public String getDuration() {
//        long hours = ChronoUnit.HOURS.between(start_time, end_time);
//        long minutes = ChronoUnit.MINUTES.between(start_time, end_time) % 60;
//        return hours + " ч " + minutes + " мин";
//    }
//
//    public boolean isActiveNow() {
//        LocalDateTime now = LocalDateTime.now();
//        return (now.isAfter(start_time) || now.isEqual(start_time))
//                && now.isBefore(end_time);
//    }
//
//    public void printFormatted() {
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//
//        System.out.println(
//                "Пользователь: " + user_name +
//                        "\nС: " + start_time.format(fmt) +
//                        "\nПо: " + end_time.format(fmt) +
//                        "\nДлительность: " + getDuration() +
//                        "\nАктивна сейчас: " + (isActiveNow() ? "да")
//        );
//    }
//}
