package k_exceptionHandling;

public class Example3 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		try {
			System.out.println(a[0]/0);//ArithmeticException
			System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
			System.out.println("Exception Handled!");
		}
	}
}
