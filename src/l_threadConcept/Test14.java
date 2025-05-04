package l_threadConcept;

// Synchronization is used to avoid thread race/collapse condition
// Synchronized methods/blocks are Thread safe
// Class-Level Lock:
// Creating a synchronized static method will internally create a class-level lock
class A {
	static synchronized void m1(String s) {
		for(int i=1; i<=5; i++) {
			System.out.println(s+" execution: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
class MyTh1 extends Thread {
	A a;
	String s;
	MyTh1(A a, String s){
		this.s = s;
	}
	@Override
	public void run() {
		A.m1(s);
	}
}
public class Test14 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		MyTh1 m1 = new MyTh1(a1,"m1");
		MyTh1 m2 = new MyTh1(a2,"m2");
		
		m1.start();
		m2.start();
	}
}
