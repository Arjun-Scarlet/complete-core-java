package k_exceptionHandling;

// Exception Handling is a mechanism used to maintain the flow of an exception
// try is a keyword which contains risky code
// catch is used to handle the exception which is occurred in try block 
public class Example1 {
	
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled!");
		}
		System.out.println("main ends");
	}
}
