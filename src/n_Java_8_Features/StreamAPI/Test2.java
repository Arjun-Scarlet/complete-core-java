package n_Java_8_Features.StreamAPI;

// filter() is used to filter the Stream elements based on condition(it uses Predicate interface)
// forEach() is used to iterate over the Stream elements(it uses Consumer interface)
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		//printing strings from a list which 1st character is 'A'
		List<String> l = Arrays.asList("Kaththi", "GOAT", "Amaran", "Don", "Anjaan", "Jai Bhim");
		l.stream().filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));
	}
}
