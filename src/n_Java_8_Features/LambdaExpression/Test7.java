package n_Java_8_Features.LambdaExpression;

// Lambda expression in Predicate interface
// Predicate is a functional interface used for conditional checking
// It have test() with 1 arg and return type boolean
import java.util.function.Predicate;
public class Test7 {

	public static void main(String[] args) {
		//printing even numbers
		Predicate<Integer> p = n -> n%2==0;
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i: a) {
			if(p.test(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
