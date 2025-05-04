package n_Java_8_Features.LambdaExpression;

// Lambda expression in Consumer interface
// Consumer is a functional interface used to consume/print the data
// It have accept() with return type void

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Test11 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		Predicate<Integer> p = n -> n%2==0;
		Function<Integer,Integer> f = n -> n+10;
		//increments the even number 10 times
		for(int i=0; i<a.length; i++) {
			if(p.test(a[i])) a[i] = f.apply(a[i]);
		}
		//it will print the data
		Consumer<Integer> c = n -> System.out.println(n+" ");
		for(int i:a) {
			c.accept(i);
		}
	}
}
