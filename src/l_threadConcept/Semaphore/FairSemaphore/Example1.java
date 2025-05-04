package l_threadConcept.Semaphore.FairSemaphore;

// Fair Semaphore works based on First Come, First Served thread execution
// It helps to avoid thread starvation
import java.util.concurrent.Semaphore;

class Worker {
	static Semaphore sem = new Semaphore(1, true);
	
	public void work(String name) {
		try {
			System.out.println(name+" is waiting for work");
			sem.acquire();
			System.out.println(name+" acquired permission");
			Thread.sleep(1000);
			System.out.println(name+" is finished working");
			sem.release();
		} catch(InterruptedException e) {}
	}
}

class Th1 extends Thread {
	Worker worker;
	String name;
	Th1(Worker w, String n){
		worker = w;
		name = n;
	}
	
	@Override
	public void run() {
		worker.work(name);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Worker w = new Worker();
		for(int i=1; i<=3; i++) {
			Th1 t = new Th1(w, "Thread-"+i);
			t.start();
		}
	}
}
