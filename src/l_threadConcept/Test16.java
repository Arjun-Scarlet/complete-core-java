package l_threadConcept;

// Two threads are waiting for each other forever situation is called Deadlock
// It is also known as Infinite Waiting of Thread
// Deadlock will occur because of synchronized keyword
// This code will not terminate because of deadlock and we can't able to resolve deadlock
class C {
	public synchronized void m1(D d) {
		System.out.println("C-m1()");
		System.out.println("C is calling D class's typeD()");
		d.typeD();
	}
	public synchronized void typeC() {
		System.out.println("C-typeC()");
	}
} 

class D {
	public synchronized void m2(C c) {
		System.out.println("D-m2()");
		System.out.println("D is calling C class's typeC()");
		c.typeC();
	}
	public synchronized void typeD() {
		System.out.println("D-typeD()");
	}
}

class MyTh3 extends Thread {
	C c = new C();
	D d = new D();
	@Override
	public void run() {
		c.m1(d);//c is locked and tries to call m1(d)
	}
	public void user() {
		d.m2(c);//d is locked and tries to call m2(c)
	}
  //c is locked and tries to call m1(d) but d is locked by user() method so both c and d are waiting
}
public class Test16 {

	public static void main(String[] args) {
		MyTh3 m = new MyTh3();
		m.start();
		m.user();
		
	  /*Either we can use separate Thread class or we can use
		C c = new C();
		D d = new D();
		Thread t1 = new Thread(()->c.m1(d));
		Thread t2 = new Thread(()->d.m2(c));
		t1.start();
		t2.start(); */
	}
}
