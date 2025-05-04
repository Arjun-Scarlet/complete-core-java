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

//Method-2: By using wait() and notifyAll()
class Print {
	private int turn = 1;
	
	synchronized void square(int num, int threadId) {
		try {
			while(turn!=threadId) {
				wait();//if it is not this thread's turn, it will wait
			}
			System.out.println("Thread-"+threadId+": "+num*num);
			turn = (threadId%3) + 1;//move to the next thread in cyclic order
			notifyAll();//notifies all other waiting threads
		} catch (InterruptedException e) {}
	}
}

class Thread1 extends Thread {
	Print print;
	Thread1(Print p) {
		print = p;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i+=3) {
			print.square(i, 1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

class Thread2 extends Thread {
	Print print;
	Thread2(Print p) {
		print = p;
	}
	
	@Override
	public void run() {
		for(int i=2; i<=10; i+=3) {
			print.square(i, 2);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

class Thread3 extends Thread {
	Print print;
	Thread3(Print p) {
		print = p;
	}
	
	@Override
	public void run() {
		for(int i=3; i<=10; i+=3) {
			print.square(i, 3);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

public class Test18_1 {

	public static void main(String[] args) {
		Print p = new Print();
		
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		Thread3 t3 = new Thread3(p);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

















