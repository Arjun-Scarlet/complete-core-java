package l_threadConcept;

// Executing main thread first and then child thread by using main thread's join() in child thread
// We can't able to use main thread's join() directly inside child thread
// We need to create a static Thread variable and then use that variable to give main thread's join() inside child thread
class MyThread8 extends Thread {
	static Thread m;//considered as main thread's variable
	@Override
    public void run() {
		try {
			m.join();
		} catch (InterruptedException e) {}
        for (int i=1; i<=5; i++) {
            System.out.println("Child thread: " + i);
        }
    }
}
public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		MyThread8 m1 = new MyThread8();
		MyThread8.m = Thread.currentThread();//initializing MyThread8's static Thread variable by assigning main thread
		m1.start();
		for (int i=1; i<=5; i++) {
            System.out.println("Main thread: " + i);
            Thread.sleep(500);
        }
	}
}
