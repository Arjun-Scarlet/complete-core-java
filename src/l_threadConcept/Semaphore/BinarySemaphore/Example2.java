package l_threadConcept.Semaphore.BinarySemaphore;

import java.util.concurrent.Semaphore;

class DressingRoom {
	private Semaphore sem = new Semaphore(1);
	
	public void use(String customer) {
		try {
			System.out.println(customer+" is waiting for the dressing room");
			sem.acquire();
			System.out.println(customer+" is using the dressing room");
			Thread.sleep(1000);
			System.out.println(customer+" is finished and left the room");
		} catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
	}
}

class Customer extends Thread {
	DressingRoom room;
	String name;
	Customer(DressingRoom r, String n){
		room = r;
		name = n;
	}
	
	@Override
	public void run() {
		room.use(name);
	}
}
public class Example2 {

	public static void main(String[] args) {
		DressingRoom room = new DressingRoom();
		 new Customer(room, "Sylpie").start();
		 new Customer(room, "Tori").start();
		 new Customer(room, "Zelfa").start();
		 new Customer(room, "Emma").start();
	}
}















