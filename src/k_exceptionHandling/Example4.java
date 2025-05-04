package k_exceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("Exception Handled!");
		}
	}
}
