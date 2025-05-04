package l_threadConcept;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child thread: "+i);
			try {
				Thread.sleep(2000);//used to delay the thread execution by specified time(2000~2sec)
			} catch (InterruptedException e) {}
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		m1.start();
		for(int i=1; i<=5; i++) {
			System.out.println("Main thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}