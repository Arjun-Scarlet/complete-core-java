package l_threadConcept.Semaphore.CountingSemaphore;

import java.util.concurrent.Semaphore;

class ATM {
	private Semaphore sem;
	ATM(int slots){
		sem = new Semaphore(slots);
	}
	
	public void useATM(String person) {
		try {
			//acquiring the semaphore(taking one ATM slot)
			sem.acquire();
			System.out.println(person+" is using the ATM");
			Thread.sleep(1000);
			System.out.println(person+" is finished using ATM");
		} catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //releasing the semaphore(freeing one ATM slot)
            sem.release();
        }
	}
}

class Person extends Thread {
	private ATM atm;
	private String name;
	Person(ATM a, String n){
		atm = a;
		name = n;
	}
	
	@Override
	public void run() {
		atm.useATM(name);
	}
}
public class Example2 {

	public static void main(String[] args) {
		ATM atm = new ATM(3);//only 3 ATMs are available at a time
		
		new Person(atm, "Alpha").start();
		new Person(atm, "Zeta").start();
		new Person(atm, "Delta").start();
		new Person(atm, "Gamma").start();
		new Person(atm, "Epsilon").start();
	}
}



















