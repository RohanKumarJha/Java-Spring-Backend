import java.time.LocalDate;
import java.time.Month;

public class Tester {
    public static void main(String[] args) {
        // To print today's date which function should I use ?
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println();
		System.out.println("************"+"of()"+"************");
        System.out.println("LocalDate.of(1998,8,10) : "+LocalDate.of(1998, 8, 10));
        System.out.println("LocalDate.of(1998,Month.August,10) : "+LocalDate.of(1998, Month.AUGUST, 10));
    }
}