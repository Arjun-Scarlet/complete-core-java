package n_Java_8_Features.LambdaExpression;

@FunctionalInterface
interface I4 {
	int square(int n);
}

@FunctionalInterface
interface I5 {
	int length(String s);
}

public class Test4 {

	public static void main(String[] args) {
		I4 i = n -> {
			return n*n;
		};
		System.out.println("Square: "+i.square(5));
		
		//for single line return statement is not mandatory
		i = n -> n*n;
		System.out.println("Square: "+i.square(7));
		System.out.println("----------");
		
		I5 j = n -> n.length();
		System.out.println("Length: "+j.length("Shadow"));
	}
}
