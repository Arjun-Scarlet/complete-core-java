package n_Java_8_Features.StreamAPI;

// distinct() returns unique elements from Stream
// collect() used to the Stream elements
// Collectors.toList() convert stream elements into a List and Collectors.toSet() converts stream elements into a Set
import java.util.*;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,5,7,3,5,9,1);
		//Method-1 to remove duplicates
		List<Integer> list = l.stream().distinct().collect(Collectors.toList());
		System.out.println("List: "+list);
		
		//Method-2 to remove duplicates
		Set<Integer> set = l.stream().collect(Collectors.toSet());
		System.out.println("Set: "+set);
	}
}
