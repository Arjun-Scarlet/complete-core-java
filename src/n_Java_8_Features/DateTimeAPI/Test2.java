package n_Java_8_Features.DateTimeAPI;

// Whatever methods used in LocalDate and LocalTime, we can use that in LocalDateTime
import java.time.*;
public class Test2 {

	public static void main(String[] args) {
		System.out.println(LocalDate.now().plusYears(7));//adds 7 years from current system date
		System.out.println(LocalDate.now().plusMonths(4));//adds 4 months from current system date
		System.out.println(LocalDate.now().plusWeeks(2));//adds 2 weeks from current system date
		System.out.println(LocalDate.now().plusDays(5));//adds 5 days from current system date
		System.out.println("-----------");
		
		System.out.println(LocalTime.now().plusHours(2));//adds 2 hours from current system time
		System.out.println(LocalTime.now().plusMinutes(30));//adds 30 mins from current system time
		System.out.println(LocalTime.now().plusSeconds(50));//adds 50 secs from current system time
		System.out.println("-----------");
		
		System.out.println(LocalDateTime.now().plusDays(6));
		System.out.println(LocalDateTime.now().plusHours(8));
		System.out.println(LocalDateTime.now().plusMonths(3).plusMinutes(12));
		
		//we have minus methods same as plus for both LocalDate and LocalTime
	}
}
