package n_Java_8_Features.LambdaExpression;

@FunctionalInterface
interface I2 {
	void display(int a);
}

public class Test2 {

	public static void main(String[] args) {
		I2 i = (int n) -> System.out.println("display() variable: "+n);
		i.display(10);
		
		i = (n) -> System.out.println("display() variable: "+n);//datatype is not mandatory
		i.display(20);
		
		i = n -> System.out.println("display() variable: "+n);//for a single argument () is not mandatory
		i.display(30);
	}
}
