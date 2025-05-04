package n_Java_8_Features.InnerClass;

// Anonymous inner class associated with interface
interface I1 {
	void m1();
}

public class Test5 {

	public static void main(String[] args) {
		I1 i = new I1() {
			@Override
			public void m1() {
				System.out.println("Overridden interface method");
				System.out.println("Anonymous IC-m1()");
			}
		};
		i.m1();
	}
}
