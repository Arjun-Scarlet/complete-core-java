package n_Java_8_Features.DateTimeAPI;

import java.time.*;

public class Test3 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2024, 10, 05);
		System.out.println(LocalDate.now().isAfter(d));//returns true if the current date is present after given date
		System.out.println(LocalDate.now().isBefore(d));//returns true if the current date is present before given date
		System.out.println(LocalDate.now().isEqual(d));//returns true if the current date is equal to the given date
		System.out.println("-----------");
		
		LocalTime t = LocalTime.of(12, 35);
		System.out.println(LocalTime.now().isAfter(t));//returns true if the current time is present after given time
		System.out.println(LocalTime.now().isBefore(t));//returns true if the current time is present before given time
		System.out.println("-----------");
		
		System.out.println(LocalDate.now().getDayOfMonth());//returns current day
		System.out.println(LocalDate.now().getMonth());//returns current month
		System.out.println(LocalDate.now().getYear());//returns current year
		System.out.println("-----------");
		
		System.out.println(LocalTime.now().getHour());//returns current hour
		System.out.println(LocalTime.now().getMinute());//returns current minute
		System.out.println(LocalTime.now().getSecond());//returns current seconds
	}
}
