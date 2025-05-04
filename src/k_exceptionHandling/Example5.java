package k_exceptionHandling;

// try with multiple catch
public class Example5 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			String s = "Hello";
			System.out.println(s.charAt(6));
			s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("ArithmeticException Handled!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("ArrayIndexOutOfBoundsException Handled!");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception Handled!");
		}
		/*
		After declaring Exception type catch block, every catch block under that is unreachable statement
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException Handled!");
		}
		*/
	}
}
