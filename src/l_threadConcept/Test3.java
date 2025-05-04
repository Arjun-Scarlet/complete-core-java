package l_threadConcept;

//Creating thread by implementing Runnable interface
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class Test3 {

	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2();
//		m1.start();--> CTE
		Thread m2 = new Thread(m1);
		m2.start();
	}
}
