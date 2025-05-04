package n_Java_8_Features.StreamAPI.Reference;

import java.util.*;
/* It is optional when we are using stream()
@FunctionalInterface
interface I3 {
	String display(String s);
}
*/
public class StaticMR3 {

	static String print(String s) {
		if(s.startsWith("A")) return s.toUpperCase();
		return s.toLowerCase();
	}
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Aladin", "Sindbad", "Alibaba", "Morgiana", "Judal");
		l.stream().map(StaticMR3::print).forEach(System.out::println);
	}
}
