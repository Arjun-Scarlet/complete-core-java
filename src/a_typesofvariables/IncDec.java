package a_typesofvariables;

public class IncDec {

	public static void main(String[] args) {
		int a = 1, b = 5;
		System.out.println("pre increment: "+ ++a);
		System.out.println("post increment "+ a++);
		System.out.println(a++ + ++a);
		System.out.println("pre decrement: "+ --b);
		System.out.println("post decrement: "+ b--);
		System.out.println(b-- + --b);
	}

}
