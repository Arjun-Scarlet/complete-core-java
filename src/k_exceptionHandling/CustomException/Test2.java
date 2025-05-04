package k_exceptionHandling.CustomException;


import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) throws InvalidVotingException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		if(age>=18) System.out.println("Eligible for Voting!");
		else
			throw new InvalidVotingException();
	}
}
