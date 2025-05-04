package e_oopsConcepts.WrapperClass;

public class Xtra4 {
	static Integer m1(int a) {
		System.out.println("m1(int)");
		return a;
	}
	static int m1(Integer a) {
		System.out.println("m1(Integer)");
		return a;
	}
	public static void main(String[] args) {
		System.out.println(m1(10));//Integer(Non-Primitive)
		System.out.println(m1(new Integer(20)));//int(Primitive)
	}
}
