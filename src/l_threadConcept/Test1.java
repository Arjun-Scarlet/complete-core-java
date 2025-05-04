package l_threadConcept;

// Thread is a light-weight sub process which allows a program to perform multiple task simultaneously
// Thread is independent and maintain separate stack memory

// Creating thread by extending Thread class
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child thread: "+i);
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		System.out.println(m1.isAlive());//false because the thread execution is not started
		m1.start();//new thread is created and started and run() is invoked
//		m1.start();-->IllegalThreadStateException
		System.out.println(m1.isAlive());//true
		for(int i=1; i<=5; i++) {
			System.out.println("Main thread: "+i);
		}
	}
}
