package k_exceptionHandling.CustomException;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IOB_ATM a = new IOB_ATM("Robin", 5000);
		System.out.println("1. Withdraw\n2. Deposit");
		int n = sc.nextInt();
		if(n==1) {
			System.out.print("Enter the amount: ");
			int amt = sc.nextInt();
			a.withdraw(amt);
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
