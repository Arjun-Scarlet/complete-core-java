package n_Java_8_Features.LambdaExpression;

//Lambda expression in Consumer interface
//Supplier is a functional interface used to supply/get the data
//It have get() with return type is generic type of Supplier interface

import java.util.function.Supplier;
public class Test13 {
	
	public static void main(String[] args) {
		Supplier<Employee> s1 = () -> new Employee("Meera", 9500);
		Supplier<String> s2 = () -> "Hello Everyone!";
		Employee e = s1.get();
		System.out.println(e);
		System.out.println(s2.get());
	}
}
