package n_Java_8_Features.StreamAPI.Reference;

import java.util.*;
@FunctionalInterface
interface I5 {
	int sq(int n);
}

public class InstanceMR2 {

	int square(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		InstanceMR2 n1 = new InstanceMR2();
		//way-1
		l.stream().map(n1::square).forEach(n -> System.out.print(n+" "));
		System.out.println("\n--------");
		//way-2
		l.stream().map(n1::square).forEach(System.out::println);
	}
}
