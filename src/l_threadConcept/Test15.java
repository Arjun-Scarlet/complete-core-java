package l_threadConcept;

// Object-Level Lock:
// Creating a synchronized non-static method will internally create a object-level lock
// It depends on no. of object created for a class
class B {
	synchronized void m1(String s) {
		for(int i=1; i<=5; i++) {
			System.out.println(s+" execution: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
class MyTh2 extends Thread {
	B b;
	String s;
	MyTh2(B b, String s){
		this.b = b;
		this.s = s;
	}
	@Override
	public void run() {
		b.m1(s);
	}
}
public class Test15 {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		
		MyTh2 m1 = new MyTh2(b1,"m1");
		MyTh2 m2 = new MyTh2(b2,"m2");
		
		m1.start();
		m2.start();
	}
}
