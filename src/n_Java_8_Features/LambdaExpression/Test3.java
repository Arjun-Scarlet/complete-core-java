package n_Java_8_Features.LambdaExpression;

@FunctionalInterface
interface I3 {
	void display(int i, String s);
}
public class Test3 {

	public static void main(String[] args) {
		//for more than one argument () is mandatory
		I3 i = (int n, String s) -> {System.out.println("display() variables: "+n+", "+s);};
		i.display(10, "Hello");
		
		i = (n,s) -> {System.out.println("display() variables: "+n+", "+s);};//datatype is not mandatory
		i.display(10, "Everyone");
	}
}
