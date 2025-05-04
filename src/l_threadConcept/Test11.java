package l_threadConcept;

// Execution order --> T1 T2 Main
class T1 extends Thread {
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
            System.out.println("T1 thread: " + i);
        }
	}
}

class T2 extends Thread {
	static T1 m;
	@Override
	public void run() {
		try {
			m.join();
		} catch (InterruptedException e) {}
		
		for (int i=1; i<=5; i++) {
            System.out.println("T2 thread: " + i);
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
        }
	}
}

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
		T2.m = t1;//initializing T2's static T1 variable by assigning T1 thread
		t1.start();
		T2 t2 = new T2();
		t2.start();
		t2.join();
		for (int i=1; i<=5; i++) {
            System.out.println("Main thread: " + i);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
        }
	}
}
