package k_exceptionHandling;

//Passing an exception to its caller method is called propagation
//The exceptions which are subclass of RunTimeException class called Unchecked Exception
//It is also known as Compiler Unknown Exception
//Propagation is implicit for unchecked exception

import java.io.FileNotFoundException;
import java.io.FileReader;
public class Example9 {
	
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			FileReader f = new FileReader("D:\\eclipse-workspace\\FileHandling\\file1.txt");
			System.out.println("Data Reading...");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Exception Handled!");
		}
		System.out.println("main ends");
	}
}
