package n_Java_8_Features.LambdaExpression;

import java.util.function.Predicate;
public class Test8 {

	public static void main(String[] args) {
		//printing a string length which length > 4
		Predicate<String> p = n -> n.length()>4;
		
		String[] a = {"deku","killua","gojo","ayanokoji"};
		for(String i: a) {
			if(p.test(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
