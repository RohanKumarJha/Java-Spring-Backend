import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) {
        LocalDate Dob = LocalDate.of(1998, 8, 10);
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(pattern.format(Dob));
        System.out.println("You are "+(Dob.getYear()-curDate.getYear())+" years, "+(Dob.getMonthValue()-curDate.getMonthValue())+" months and "+(Dob.getDayOfYear()-curDate.getDayOfYear())+" days old.");
    }
}