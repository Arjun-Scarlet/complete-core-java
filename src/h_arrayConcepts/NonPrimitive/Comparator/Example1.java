package h_arrayConcepts.NonPrimitive.Comparator;

// Comparator is an interface used to compare 2 object properties one at a time
// It is a third party class which helps to compare objects
// By using Comapartor's compare() we can customize the Arrays.sort() by passing comparator instance as an argument

import java.util.Comparator;
import java.util.Arrays;
class Compare implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return ((String)o1).length()-((String)o2).length();
	}
}
public class Example1 {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "sql", "javaScript"};
		// Normally Arrays.sort() returns based on ASCII order of the string
		Arrays.sort(arr);
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("----------");
		// Here it returns based on the length of the string
		Arrays.sort(arr, new Compare());
		for(String s:arr) {
			System.out.println(s);
		}
	}

}
