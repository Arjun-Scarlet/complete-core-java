package l_threadConcept.Semaphore;

// Semaphore is used to control access to a shared resource by multiple thread
// It is present in java.util.concurrent package
// It prevents thread race condition and deadlock by controlling thread execution, but it doesn't control execution order
// In otherwords, Semaphore only avoids thread race condition, but not the execution order
import java.util.concurrent.Semaphore;

class Resource {
	static int count;
}

class MyThread extends Thread {
	private Semaphore sem;
	private boolean inc;
	MyThread(Semaphore s, boolean i) {
		sem = s;
		inc = i;
	}
	
	@Override
	public void run() {
		try {
			sem.acquire();
			for(int i=1; i<=5; i++) {
				if(inc) Resource.count++;
				else Resource.count--;
				System.out.println(getName()+": "+Resource.count);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			sem.release();
		}
	}
}

public class Semaphore1 {

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem = new Semaphore(1);
		 MyThread t1 = new MyThread(sem, true);
		 MyThread t2 = new MyThread(sem, false);
		 MyThread t3 = new MyThread(sem, true);//if it is not there, then final count becomes 0
		 
		 t1.setName("Increment Thread");
		 t2.setName("Decrement Thread");
		 t3.setName("Additional Thread");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 t1.join();
		 t2.join();
		 t3.join();
		 System.out.println("Final count: "+Resource.count);
	}
}










