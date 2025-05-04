package k_exceptionHandling.CustomException;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		SBI_ATM a = new SBI_ATM("Deku", 10000);
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Withdraw\n2. Deposit");
		int n = sc.nextInt();
		if(n==1) {
		try {
			System.out.print("Enter the amount: ");
			int amt = sc.nextInt();
			a.withdraw(amt);
		} 
		catch (InsufficientBalException e) {
			System.out.println(e);
			System.out.println("Exception Handled!");
		}
		}
		else if(n==2) {
			System.out.print("Enter the amount: ");
			int amt = sc.nextInt();
			a.deposit(amt);
		}
		else System.out.println("Invalid Option!");
		sc.close();
	}
}
