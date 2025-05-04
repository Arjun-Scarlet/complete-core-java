package k_exceptionHandling;

// Nested try-catch
public class Example6 {
	public static void main(String[] args) {
		try {
			System.out.println("outer-try");
			int[] a = {1,2,3,4,5};
//			System.out.println(a[5]);-->RTE
			try {
				System.out.println("inner-try");
				System.out.println(a[0]/0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("inner-catch");
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("outer-catch");
		}
	}
}
