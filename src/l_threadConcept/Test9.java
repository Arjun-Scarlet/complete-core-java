package l_threadConcept;

// join() is used to allow one thread execution to wait until another thread completes its execution
// sleep() is used to pause/delay the execution of current thread for a specified time limit
// Executing child thread first and then main thread by using child thread's join() in main thread
class MyThread7 extends Thread {
	@Override
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Child thread: " + i);
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
        }
    }
}
public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		MyThread7 m1 = new MyThread7();
		m1.start();
		m1.join();
		for (int i=1; i<=5; i++) {
            System.out.println("Main thread: " + i);
        }
	}
}
