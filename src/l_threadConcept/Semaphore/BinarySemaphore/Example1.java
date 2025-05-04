package l_threadConcept.Semaphore.BinarySemaphore;

// Binary Semaphore allow only one thread can access the resource at a time
// It is similar to lock, but can be released by any thread
import java.util.concurrent.Semaphore;

class Resource {
	static Semaphore sem = new Semaphore(1, true);//binary semaphore
	
	public void access(String name) {
		try {
			System.out.println(name+" trying to acquire permit");
			sem.acquire();
			System.out.println(name+" permit acquired");
			Thread.sleep(1000);
			System.out.println(name+" releasing the permit");
			sem.release();
		} catch (InterruptedException e) {}
	}
}

class Th1 extends Thread {
	Resource res;
	String name;
	Th1(Resource r, String n){
		res = r;
		name = n;
	}
	
	@Override
	public void run() {
		res.access(name);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Resource res = new Resource();
		Th1 t1 = new Th1(res, "Thread-1");
		Th1 t2 = new Th1(res, "Thread-2");
		Th1 t3 = new Th1(res, "Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}
}









