package n_Java_8_Features.LambdaExpression;

// Lambda expression in Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test6 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Collections.sort(a);
		System.out.println(a);//natural sorting order by implicit Comparable interface
		System.out.println("------------");
		
		Comparator<Integer> c = (n1, n2) -> {
			return n2 - n1;
		}; 
		//or
		c = (n1, n2) -> n2-n1;
		Collections.sort(a, c);
		System.out.println(a);
	}
}
