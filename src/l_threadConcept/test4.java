package l_threadConcept;

//getName and setName in Thread
class MyThread3 extends Thread{
	static int n;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Child Thread-");
		System.out.println(Thread.currentThread().getName()+n++);
	}
}
public class test4 {

	public static void main(String[] args) {
		MyThread3 m1 = new MyThread3();
		m1.start();
		MyThread3 m2 = new MyThread3();
		m2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
