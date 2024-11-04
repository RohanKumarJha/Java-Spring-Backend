import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class practice {
    public static void main(String[] args) {
        // LocalDate obj = LocalDate.now();
        // System.out.println(obj);
        // LocalDate obj2 = LocalDate.of(1997, 8, 10);
        // System.out.println(obj2);
        // LocalDate plusDays = obj2.plusDays(10000);
        // System.out.println(plusDays);
        // LocalDate plusWeek = obj.plusWeeks(6);
        // System.out.println(plusWeek);

        LocalDate obj1 = LocalDate.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(obj1.format(obj));

        // LocalDateTime today = LocalDateTime.now();
        // System.out.println(today);
        // System.out.println(today.getDayOfMonth());
        // System.out.println(today.getDayOfYear());
        // System.out.println(today.getHour());

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy/hh:mm:ssa");
        System.out.println(pattern.format(today));
    }
}