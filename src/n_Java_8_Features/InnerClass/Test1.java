package n_Java_8_Features.InnerClass;

// A class inside another class is called Inner class
// For inner class all access modifiers are applicable and inner class represents has-a relationship
// 1. Static Inner class(creating a class inside a class with static keyword)
// To create a static inner class object, outer class reference is not required

public class Test1 {
	int i = 10;
	static int j = 20;
	protected static class A {
		int i = 30;
		static int j = 40;
		public static void main(String[] args) {
			System.out.println("Inner class main()");
			A a1 = new A();
			System.out.println("i = "+a1.i);
			System.out.println("j = "+j);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Outer class main()");
		Test1 t1 = new Test1();
		System.out.println("Outer class i -> "+t1.i);
		System.out.println("Outer class j -> "+j);
		System.out.println("---------");
		
		Test1.A t2 = new Test1.A();//creating an instance for inner class without instantiating outer class
		System.out.println("Inner class i -> "+t2.i);
		System.out.println("Inner class j -> "+A.j);
	}
}
