package n_Java_8_Features.StreamAPI;

// Stream is an interface
// It is an API used to process the data of collection and array in a functional manner
// Stream used stream() to create a Stream object
// stream() is a non-static/default method of Collection interface

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class Test1 {

	public static void main(String[] args) {
		//printing even & odd values from the list
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		Stream<Integer> s = l.stream();
		System.out.println("Even numbers: ");
		s.filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
		//we can directly write without creating Stream object
		System.out.println("Odd numbers: ");
		l.stream().filter(n -> n%2!=0).forEach(n -> System.out.println(n));
	}
}
