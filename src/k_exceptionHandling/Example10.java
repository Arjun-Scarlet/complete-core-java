package k_exceptionHandling;

// The exceptions which are direct subclass of Exception class called Checked Exception
// It is also known as Compiler known Exception
// In checked exception handling the exception is mandatory. Otherwise, propagation must be done
// Propagation is explicit for checked exception

import java.io.FileReader;
import java.io.FileNotFoundException;
public class Example10 {
	// To propagate checked exception, we need to use throws keyword
	static void m1() throws FileNotFoundException {
		m2();
	}
	static void m2() throws FileNotFoundException {
		FileReader f = new FileReader("D:\\eclipse-workspace\\FileHandling\\file1.txt");
		System.out.println("Data Reading...");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			m1();
		}
		catch (Exception e) {
			System.out.println("Exception Handled!");
		}
		System.out.println("main ends");
	}
}
