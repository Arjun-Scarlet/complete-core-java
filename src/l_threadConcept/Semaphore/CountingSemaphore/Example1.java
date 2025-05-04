package l_threadConcept.Semaphore.CountingSemaphore;

// Counting Semaphore allows certain limit of threads to access the resource at a time
// In this type, the no. of oermits/limits controls how many threads can enter
import java.util.concurrent.Semaphore;

class Printer {
	static Semaphore sem = new Semaphore(3);
	
	public void print(String name) {
		try {
			System.out.println(name+" is waiting for printer");
			sem.acquire();
			System.out.println(name+" is printing");
			Thread.sleep(1000);
			System.out.println(name+" is finished printing");
			sem.release();
		} catch(InterruptedException e) {}
	}
}

class Th1 extends Thread {
	Printer printer;
	String name;
	Th1(Printer p, String n){
		printer = p;
		name = n;
	}
	
	@Override
	public void run() {
		printer.print(name);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Printer p = new Printer();
		for(int i=1; i<=5; i++) {
			Th1 t = new Th1(p, "Thread-"+i);
			t.start();
		}
	}
}













