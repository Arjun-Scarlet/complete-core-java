package l_threadConcept;

// The communication between 2 thread is called Inter-Thread Communication
// wait() and notify() used to achieve inter-thread communication and it can only be used inside synchronized context
// wait() --> It will stop the thread execution until notify() call
// notify() --> It will resume the waiting thread

class Account {
	int bal; 
	Account(int b){
		bal = b;
	}
	
	@Override
	public String toString() {
		return "Account balance: "+bal;
	}
	
	public synchronized void withdraw(int amt) {
		if(amt>bal) {
			System.out.println("Minimum Account Balance!");
			try {
				wait();//stops the thread execution
			} catch (InterruptedException e) {}
		}
		bal-=amt;
		System.out.println(amt+" withdrawn successfully!");
		display();
	}
	public synchronized void deposit(int amt) {
		System.out.println("Deposit in progress...");
		bal+=amt;
		System.out.println(amt+" deposited successfully!");
		display();
		notify();
	}
	private void display() {
		System.out.println("Current Balance: "+bal);
	}
}
public class Test17_0 {

	public static void main(String[] args) {
		Account a1 = new Account(1000);
		new Thread() {//Anonymous class
			@Override
			public void run() {
				a1.withdraw(2000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				a1.deposit(3000);
			}
		}.start();
	}
}















