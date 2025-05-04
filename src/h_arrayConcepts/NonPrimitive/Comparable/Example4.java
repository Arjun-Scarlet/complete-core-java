package h_arrayConcepts.NonPrimitive.Comparable;

// Arrays.sort() always depends on Comparable interface
import java.util.Arrays;
public class Example4 {

	public static void main(String[] args) {
		String[] a = {"midoriya", "uraraka", "bakugou", "todoroki"};
		
		Arrays.sort(a);// it sorts the arrays based on String class overridden compareTo()
		for(String s:a) System.out.println(s);
	}

}
