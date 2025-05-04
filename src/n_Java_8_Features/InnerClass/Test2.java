package n_Java_8_Features.InnerClass;

// 2. Non-Static Inner class(creating a class inside a class without static keyword)
// It is also known as Regular/Normal Inner class
//To create a non-static inner class object, outer class reference is mandatory
public class Test2 {
	int i = 10;
	static int j = 20;
	class B {
		int i = 15;
		static int j = 25;
	}
	
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		System.out.println("Outer class i -> "+t1.i);
		System.out.println("Outer class j -> "+j);
		System.out.println("-----------");
		
		// Way-1
		Test2 t2 = new Test2();
		Test2.B b1 = t2.new B();//creating an instance for inner class by instantiating outer class
		System.out.println("Inner class i -> "+b1.i);
		System.out.println("Inner class j -> "+B.j);
		
		// Way-2
		Test2.B b2 = new Test2().new B();
		System.out.println("Inner class i -> "+b2.i);
		
		// Way-3
		System.out.println("Inner class i -> "+new Test2().new B().i);
	}
}
