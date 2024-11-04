import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Practice {
    public static void main(String[] args) {
        // LocalTime current = LocalTime.now();
        // System.out.println(current);
        // System.out.println();
		// System.out.println("************"+"of()"+"************");
		// System.out.println("LocalTime.of(2, 55, 29) :- "+LocalTime.of(2, 55, 29));
        // System.out.println();
		// System.out.println("************"+"Functions to access date information"+"************");
		// System.out.println("What is the current hour going on .... ? :- "+current.getHour());
        // System.out.println("After 20 hours :- "+current.plusHours(20));
        // System.out.println();
		// System.out.println("************"+"Difference using ChrnoUnit"+"************");
		// LocalTime timeObj = LocalTime.of(23,20);
		// System.out.println("Difference Between current time and timeObj :- "+ChronoUnit.HOURS.between( LocalTime.now(),timeObj));

        // Practice Question
        LocalTime current = LocalTime.now();
        LocalTime totalTime = current.plusMinutes(150+15);
        System.out.println(current);
        LocalTime reachedTime = LocalTime.of(20, 0, 0);
        System.out.println(reachedTime.isAfter(totalTime));
    }
}