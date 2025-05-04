package l_threadConcept;

// Thread Methods are used to schedule the thread execution
// yield() --> It pause the current thread and allow other threads of the same or higher priority to execute
// In otherwords, it will give chance to execute high priority thread first
// It will not throw InterruptionException
// The output of Thread.yield() sometimes not predictable due to the way thread scheduling works in JVM
class MyThread6 extends Thread {
    @Override
    public void run() {
		Thread.currentThread().setPriority(10);
        for (int i=1; i<=5; i++) {
            System.out.println("Child Thread-1: "+i);
        }
    }
}

class MyTh extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child Thread-2: "+i);
			Thread.yield();//Yield to let the child thread-1 run
		}
	}
}

public class Test8 {
    public static void main(String[] args) {
        new MyThread6().start();
        new MyTh().start();
    }
}
