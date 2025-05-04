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

//Method-2: By using Semaphore
import java.util.concurrent.Semaphore;

class Child1 extends Thread {
	private Semaphore curr, next;
	Child1(Semaphore c, Semaphore n){
		curr = c;
	    next = n;
    }
   
    @Override
    public void run() {
	    for(int i=1; i<=10; i+=3) {
		    try {
			    curr.acquire();
			    System.out.println("Thread-1: "+i*i);
			    Thread.sleep(500);
			    next.release();
		    } catch (InterruptedException e) {}
	    }
    }
}

class Child2 extends Thread {
	private Semaphore curr, next;
	Child2(Semaphore c, Semaphore n){
		curr = c;
	    next = n;
    }
   
    @Override
    public void run() {
	    for(int i=2; i<=10; i+=3) {
		    try {
			    curr.acquire();
			    System.out.println("Thread-2: "+i*i);
			    Thread.sleep(500);
			    next.release();
		    } catch (InterruptedException e) {}
	    }
    }
}

class Child3 extends Thread {
	private Semaphore curr, next;
	Child3(Semaphore c, Semaphore n){
		curr = c;
	    next = n;
    }
   
    @Override
    public void run() {
	    for(int i=3; i<=10; i+=3) {
		    try {
			    curr.acquire();
			    System.out.println("Thread-3: "+i*i);
			    Thread.sleep(500);
			    next.release();
		    } catch (InterruptedException e) {}
	    }
    }
}
public class Test18_2 {

	public static void main(String[] args) {
		Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        
        Child1 t1 = new Child1(s1, s2);
        Child2 t2 = new Child2(s2, s3);
        Child3 t3 = new Child3(s3, s1);
        
        t1.start();
        t2.start();
        t3.start();
	}
}









