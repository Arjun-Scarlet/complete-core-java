package l_threadConcept;

// Deadlock by using single class
class Resource {
	synchronized void m1(Resource res) {
		System.out.println("Resource-m1()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		res.m2();//tries to acquire lock on 2nd resource
	}
	
	synchronized void m2() {
		System.out.println("Resource-m2()");
	}
}

public class Test17_1 {

	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		
		Thread t1 = new Thread(()->r1.m1(r2));//Thread-1 has r1 but waiting for r2
		Thread t2 = new Thread(()->r2.m1(r1));//Thread-2 has r2 but waiting for r1
		t1.start();
		t2.start();
	}
}
