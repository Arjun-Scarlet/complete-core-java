package n_Java_8_Features.StreamAPI.Reference;

// 3. Arbitrary method reference is used when a lambda function invokes the instance method of an unspecified object
import java.util.*;
import java.util.stream.Stream;
public class ArbitraryMR {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Aladin", "Sindbad", "Alibaba", "Morgiana", "Judal");
		Stream<String> s = l.stream().map(String::toUpperCase);
		s.forEach(System.out::println);
	}
}
