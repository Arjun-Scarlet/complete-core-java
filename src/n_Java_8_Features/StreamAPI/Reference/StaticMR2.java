package n_Java_8_Features.StreamAPI.Reference;

import java.util.*;
@FunctionalInterface
interface I2 {
	void m1(String s);
}

public class StaticMR2 {

	static void display(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		List<String> l = Arrays.asList("AAAA", "BBB", "CC", "DDD");
		//using lambda expression
		l.stream().forEach(n -> System.out.println(n));
		System.out.println("--------");
		
		//using static reference
		l.stream().forEach(StaticMR2::display);
	}
}
