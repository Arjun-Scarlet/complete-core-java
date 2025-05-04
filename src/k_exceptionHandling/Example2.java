package k_exceptionHandling;

public class Example2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		try {
			System.out.println(a[3]);
			System.out.println("try block");
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled!");
			System.out.println(e);//returns reference of ArrayIndexOutOfBoundsException class with description
			System.out.println(e.getMessage());//returns the description
			e.printStackTrace();// returns runtime exception
		}
		
	}
}
