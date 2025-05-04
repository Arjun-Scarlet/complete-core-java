package l_threadConcept;

// Execution order --> T2 Main T1
class T3 extends Thread {
	static Thread m;
	@Override
	public void run() {
		try {
			m.join();
		} catch (InterruptedException e) {}
		
		for (int i=1; i<=5; i++) {
            System.out.println("T3 thread: " + i);
        }
	}
}

class T4 extends Thread {
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
            System.out.println("T4 thread: " + i);
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
        }
	}
}

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		T4 t4 = new T4();
		t4.start();
		t4.join();
		T3 t3 = new T3();
		T3.m = Thread.currentThread();
		t3.start();
		for (int i=1; i<=5; i++) {
            System.out.println("Main thread: " + i);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
        }
	}
}
