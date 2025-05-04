package l_threadConcept.Semaphore.FairSemaphore;

import java.util.concurrent.Semaphore;

class TicketCounter {
	private Semaphore sem;
	TicketCounter(boolean fair){
		sem = new Semaphore(2, fair);
	}
	
	public void buyTicket(String customer) {
		try {
			System.out.println(customer+" is waiting to buy a ticket");
			sem.acquire();
			System.out.println(customer+" is buying a ticket");
			Thread.sleep(1000);
			System.out.println(customer+" got the ticket and left");
		} catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
	}
}

class Customer extends Thread {
	TicketCounter ticket;
	String name;
	Customer(TicketCounter t, String n){
		ticket = t;
		name = n;
	}
	
	@Override
	public void run() {
		ticket.buyTicket(name);
	}
}
public class Example2 {

	public static void main(String[] args) {
		TicketCounter ticket = new TicketCounter(true); //Fairness enabled

        new Customer(ticket, "Negi").start();
        new Customer(ticket, "Tomoe").start();
        new Customer(ticket, "Misuki").start();
        new Customer(ticket, "Eiko").start();
	}
}

















