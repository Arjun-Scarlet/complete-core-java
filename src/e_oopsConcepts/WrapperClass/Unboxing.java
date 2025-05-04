package e_oopsConcepts.WrapperClass;

// Converting non-primitive wrapper type values into its corresponding primitive type called Auto-Unboxing
public class Unboxing {
	public static void main(String[] args) {
		//before JDK 1.5 --> Unboxing
		Integer a = 10;
		int b = a.intValue();
		System.out.println("Non-Primitive => "+a);
		System.out.println("Primitive => "+b);
		System.out.println("------------");
		//from JDK 1.5 --> Auto-Unboxing
		int c = new Integer(a);// method-1(not recommended)
		System.out.println("Primitive => "+c);
		System.out.println("------------");
		int d = a;//method-2(implicit type casting)
		System.out.println("Primitive => "+d);
	}
}
