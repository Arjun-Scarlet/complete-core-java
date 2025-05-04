package n_Java_8_Features.StreamAPI.Reference;

// Method Reference is used to refer a method of functional interface
// It is an easy form of lambda expression
// Method reference does not execute/implement the method instead it will refer it
// 1. Static method reference is used when a lambda function invokes the static method
@FunctionalInterface
interface I1 {
	void m1(String s);
}

public class StaticMR1 {

	static void display(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		//using lambda expression
		I1 i = s -> System.out.println(s);
		i.m1("Hello Everyone!");
		
		//using static reference
		I1 j = StaticMR1::display;
		j.m1("Welcome to Java!");//interface method implemented by referring the static method
	}
}
