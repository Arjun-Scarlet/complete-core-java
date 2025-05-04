package k_exceptionHandling.CustomException;

public class SBI_ATM {
	String user;
	static int bal;
	public SBI_ATM(String u, int b) {
		user = u;
		bal = b;
	}
	public void withdraw(int amt) throws InsufficientBalException {
		if(amt<=bal) {
			bal-=amt;
			System.out.println("Rs."+amt+" withdrawn successfully!");
			System.out.println("Your current balance is Rs."+bal);
		}
		else {
			throw new InsufficientBalException();
		}
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("Rs."+amt+" deposited successfully!");
		System.out.println("Your current balance is Rs."+bal);
	}
}
