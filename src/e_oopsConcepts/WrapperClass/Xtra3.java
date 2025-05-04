package e_oopsConcepts.WrapperClass;

public class Xtra3 {
	static void m1(Integer i, int j) {
		System.out.println("m1(Integer,int)");
	}
	static void m1(int i, Integer j) {
		System.out.println("m1(int,Integer)");
	}
	public static void main(String[] args) {
		Integer a = 10;
		int b = 20;
		m1(a, b);
		m1(b, a);
		m1(10, a);
//		m1(10, 10);-->CTS(if any one method), CTE(both method)
	}
}
