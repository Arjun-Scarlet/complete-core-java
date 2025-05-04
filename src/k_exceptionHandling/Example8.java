package k_exceptionHandling;

public class Example8 {
	
	static void m1() {
		System.out.println(10/0);
	}
	static void m2() {
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println("Exception Handled!");
		}
	}
	public static void main(String[] args) {
		// The exception can be handled by any one of these methods
		m2();
	}
}
