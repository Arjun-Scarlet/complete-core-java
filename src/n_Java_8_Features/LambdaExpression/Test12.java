package n_Java_8_Features.LambdaExpression;

// Test11 without Function interface
import java.util.function.*;
public class Test12 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		Predicate<Integer> p = n -> n%2==0;
		Consumer<Integer> c = n -> {
			if(p.test(a[n])) 
			a[n] = a[n]+10;
			System.out.println(a[n]);
		};
		for(int i=0; i<a.length; i++) {
			c.accept(i);
		}
	}
}
