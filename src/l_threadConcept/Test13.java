package l_threadConcept;

// Daemon Threads is a background working thread used to give support to the Non-Daemon Threads
// It is also Known as Low Priority Threads
// All user defined threads are Non-Daemon Threads
// It will execute with the help of a Daemon Thread

class T5 extends Thread {//Non-Daemon thread
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("T5 thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
public class Test13 {
	
	public static void main(String[] args) {
		T5 t5 = new T5();
		System.out.println(t5.isDaemon());//false
		System.out.println(Thread.currentThread().isDaemon());//false
	    /* 
	    we cannot able to change main thread Daemon nature main thread is not a daemon thread
		Thread.currentThread().setDaemon(true); --> IllegalThreadStateException
	    */
		t5.setDaemon(true);//changing Daemon nature
		System.out.println(t5.isDaemon());//true
		t5.start();
		for(int i=1; i<=5; i++) {
			System.out.println("main thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
