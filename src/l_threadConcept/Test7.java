package l_threadConcept;

class MyThread5 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child thread: "+i);
		}
	}
}
public class Test7 {

	public static void main(String[] args) {
		MyThread5 m1 = new MyThread5();
		m1.setPriority(9);//setting priority for child thread
		m1.start();
		Thread.currentThread().setPriority(10);//setting priority for main thread
		for(int i=1; i<=5; i++) {
			System.out.println("Main thread: "+i);
		}
	}
}
