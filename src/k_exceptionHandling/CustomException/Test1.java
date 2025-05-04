package k_exceptionHandling.CustomException;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		if(age>=25 && age<=38) System.out.println("Eligible for Marriage!");
		else {
			AgeInvalidException a = new AgeInvalidException();
			throw a;
		}
	}
}
