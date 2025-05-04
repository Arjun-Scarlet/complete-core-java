package l_threadConcept.GarbageCollection;

// Garbage Collector is a daemon thread
// It is a part of JVM and runs as a background
// It automatically manages the memory by removing unused objects
class A {
	A(){
		System.out.println("Object A is created");
	}
	@Override
	public void finalize() throws Throwable { 
		try {
			System.out.println("Cleaning up the resources!");
		} 
		finally {
			super.finalize();//finalize() method deprecated in Java 9 version
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		A a1 = new A();
		a1 = null;
		System.gc();
		System.out.println("main ends");
	}
}
