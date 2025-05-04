package e_oopsConcepts.WrapperClass;

public class Xtra1 {
	static void m1(int a) {
		System.out.println("m1(int)");
	}
	static void m1(Integer a) {
		System.out.println("m1(Integer)");
	}
	static void m1(Object o) {
		System.out.println("m1(Object)");
	}
	public static void main(String[] args) {
		int a = 10;
		Integer b = 20;
		m1(a);
		m1(b);
		m1(new Integer(30));
	}
}
