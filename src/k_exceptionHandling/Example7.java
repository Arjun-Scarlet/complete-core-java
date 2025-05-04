package k_exceptionHandling;

// finally is used to write costly resources
// finally block will be executed each time whether the exception occurred or not
public class Example7 {
	public static void main(String[] args) {
		String s = null;
		System.out.println("main starts");
		try {
			System.out.println(s.length());
			return;
		} 
		catch (NullPointerException e) {
			System.out.println("Exception Handled!");
		}
		finally {
			System.out.println("finally-block");
		}
		System.out.println("main ends");
	}
}
