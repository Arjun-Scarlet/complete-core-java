package k_exceptionHandling.CustomException;

public class IOB_ATM {
	String user;
	static int bal;
	public IOB_ATM(String u, int b) {
		user = u;
		bal = b;
	}
	public void withdraw(int amt) {
		if(amt<=bal) {
			bal-=amt;
			System.out.println("Rs."+amt+" withdrawn successfully!");
			System.out.println("Your current balance is Rs."+bal);
		}
		else {
			bal-=amt;
			System.out.println("Rs."+amt+" withdrawn successfully!");
			System.out.println("Your current balance is Rs."+bal);
			System.out.println("You don't have enough money!\nSo we provide that as a Loan amount!\nInterest will be added!");
		}
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("Rs."+amt+" deposited successfully!");
		System.out.println("Your current balance is Rs."+bal);
	}
}