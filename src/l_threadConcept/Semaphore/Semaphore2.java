package l_threadConcept.Semaphore;

import java.util.concurrent.Semaphore;

public class Semaphore2 {

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem = new Semaphore(3);
		sem.acquire();//it blocks request for 1 permit (limit->3-1=2)
		System.out.println("Available permits after aquiring: "+sem.availablePermits());
		sem.release();//it releases 1 permit which is acquired (limit->2+1=3)
		System.out.println("Available permits after releasing: "+sem.availablePermits());
		System.out.println("----------");
		
		sem.acquire(2);//it blocks request for 2 permit (limit->3-2=1)
		System.out.println("Available permits after aquiring: "+sem.availablePermits());
		sem.release(3);//it releases 3 permit (limit->1+3=4)
		System.out.println("Available permits after releasing: "+sem.availablePermits());
		System.out.println("----------");
		
		sem.tryAcquire();//it tries to acquire 1 permit but doesn't blocks
		System.out.println("Available permits after trying to aquire: "+sem.availablePermits());
		
		System.out.println("Checking the fairness: "+sem.isFair());
		sem = new Semaphore(2, true);
		System.out.println("Checking the fairness: "+sem.isFair());
		
		sem.drainPermits();//it removes all available permits
		System.out.println("Available permits: "+sem.availablePermits());
	}
}
