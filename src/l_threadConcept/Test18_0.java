package l_threadConcept;
/*
Print Sequential Output in Multi-Threading
Output:
Thread-1: 1  
Thread-2: 4  
Thread-3: 9  
Thread-1: 16  
Thread-2: 25  
Thread-3: 36  
Thread-1: 49  
Thread-2: 64  
Thread-3: 81  
Thread-1: 100  
*/

//Method-1: Using sleep(), but it will not give the output perfectly(because of thread race)
class Th1 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10; i+=3) {
			System.out.println("thread-1: "+i*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

class Th2 extends Thread {
	@Override
	public void run() {
		for(int i=2; i<=10; i+=3) {
			System.out.println("thread-2: "+i*i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {}
		}
	}
}

class Th3 extends Thread {
	@Override
	public void run() {
		for(int i=3; i<=10; i+=3) {
			System.out.println("thread-3: "+i*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Test18_0 {

	public static void main(String[] args) {
		new Th1().start();
		new Th2().start();
		new Th3().start();
	}
}
