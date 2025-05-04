package k_exceptionHandling;

// Exception is an interruption, it will occur during an execution/runtime of a program

class A extends Example{
	
}
public class Example {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		//Unchecked Exceptions
		System.out.println(10/0.0);//Infinity
		System.out.println(10/0);//ArithmeticException
		System.out.println(10%0);//ArithmeticException
		System.out.println(10.0/0);//Infinity
		System.out.println(10.0%0.0);//NaN
		System.out.println("--------");
		
		int[] arr = new int[3];
 		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
 		
 		String s1 = "java";
 		System.out.println(s1.charAt(5));//StringIndexOutOfBoundsException
 		String s2 = null;
 		System.out.println(s2.length());//NullPointerException
 		
 		String s3 = "102E";
 		System.out.println(Integer.parseInt(s3));//NumberFormatException
 		
 		Example e = new Example();
 		A a = (A)e;//ClassCastException
	}
}
