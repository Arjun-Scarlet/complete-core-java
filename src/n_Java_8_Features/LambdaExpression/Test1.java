package n_Java_8_Features.LambdaExpression;

// Lambda Expression is used to achieve functional programming in java
// It is also known as Nameless function/expression
// It can be achieved by using Functional interface
// We can write concised expression by using lambda expression

@FunctionalInterface
interface I1 {
	void m1();
}

public class Test1 {

	public static void main(String[] args) {
		I1 i = () -> {
			System.out.println("m1 is called...");
		};
		i.m1();

		I1 j = () -> System.out.println("m1 is called...");// for single line {} is not mandatory
		j.m1();
	}
}
