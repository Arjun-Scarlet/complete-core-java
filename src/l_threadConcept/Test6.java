package l_threadConcept;

// Thread scheduler thread is a part of JVM which is used to schedule the thread based on priority by using priority and thread methods
// getPriority is used to get the priority of the thread
// setPriority is used to set/modify the priority of the thread
class MyThread4 extends Thread {
	@Override
	public void run() {
		//child thread's priority always based on main thread
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
	}
}
public class Test6 {

	public static void main(String[] args) {
		MyThread4 m1 = new MyThread4();
		m1.start();
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
		System.out.println("--------");
		
		Thread.currentThread().setPriority(7);
		MyThread4 m2 = new MyThread4();
		m2.start();
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
	}
}
