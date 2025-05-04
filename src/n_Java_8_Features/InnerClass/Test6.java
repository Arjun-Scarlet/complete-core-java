package n_Java_8_Features.InnerClass;

// Anonymous inner class associated with abstract class
abstract class D {
	abstract void m1();
}

public class Test6 {

	public static void main(String[] args) {
		D d = new D() {
			@Override
			public void m1() {
				System.out.println("Overridden abstract class method");
				System.out.println("Anonymous IC-m1()");
			}
		};
		d.m1();
	}
}
