package n_Java_8_Features.StreamAPI;

// map() is used to transform the Stream elements(it uses Function interface)
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		//printing strings from a list which 1st character is 'A'
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		l.stream().map(n -> n*2).forEach(n -> System.out.println(n));
	}
}
