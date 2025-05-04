package n_Java_8_Features.LambdaExpression;

// Lambda expression in Function interface
// Function is a functional interface used to implement certain operation
// It takes argument as specified type and return it as another type which is also specified by user
// It have apply method with 1 argument and return type is generic type of Function interface(2nd arguments)
import java.util.function.Function;
public class Test9 {

	public static void main(String[] args) {
		//square of string length
		Function<String, Integer> f = s -> s.length()*s.length();
		
		String[] a = {"deku","killua","gojo","ayanokoji"};
		for(String i: a) {
			System.out.println(i+" -> "+f.apply(i));
		}
	}
}
