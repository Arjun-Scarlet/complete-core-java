package n_Java_8_Features.DateTimeAPI;

// Local Date and Time API is used to store date and time
// LocalDate is a class which represents the date in the format of yyyy-mm-dd.
// LocalTime is a class which represents the time in the railway time format of hour:min:sec
// LocalDateTime is a class which represents both date and time, it is a combination of LocalDate and LocalTime
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Test1 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();//returns current system date
		System.out.println("Date: "+d);
		
		LocalTime t = LocalTime.now();//returns current system time
		System.out.println("Time: "+t);
		
		LocalDateTime dt = LocalDateTime.now();//returns current system date and time
		System.out.println("Date and Time: "+dt);
		System.out.println("----------");
		
		d = LocalDate.of(2024, 11, 26);//returns specified date
		System.out.println("Custom Date: "+d);
		
		t = LocalTime.of(05, 36);
		System.out.println("Custom Time: "+t);//returns specified time
		System.out.println("Custom Time with seconds: "+LocalTime.of(03, 25, 10));
		
		dt = LocalDateTime.of(d, t);//returns specified date and time
		System.out.println("Custom Date and Time: "+dt);
		System.out.println("Custom Date and Time: "+LocalDateTime.of(2024, 06, 19, 8, 51));
	}
}
