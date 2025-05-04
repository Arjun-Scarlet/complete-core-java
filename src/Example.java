//Java 8: 
//inner class, lamada expression, time and data api, stream api, method reference
//lamada expression --> lamada function --> only works with functional interface
//lamada exp/func --> nameless function --> we can write more consized code --> faster than implementation class
//Functional Interface --> Runnable, Comparable, Comparator, Predicate, Function, Supplier, Consumer
interface I1 {
	int square(int a);
}

public class Example {

	public static void main(String[] args) {
		I1 i1 = (a) -> { 
			return a*a;
		};
		System.out.println(i1.square(10));
		
		I1 i2 = (a) -> {return a*a;};
		System.out.println(i2.square(5));
	}
}