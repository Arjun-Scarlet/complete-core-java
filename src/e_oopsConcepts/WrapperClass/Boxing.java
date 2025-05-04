package e_oopsConcepts.WrapperClass;

// A non-primitive version of primitive data type called Wrapper class
// Converting primitive type values into its corresponding non-primitive wrapper type called Auto-Boxing
public class Boxing {
	public static void main(String[] args) {
		//before JDK 1.5 --> Boxing
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println("Primitive => "+a);
		System.out.println("Non-Primitive => "+b);
		System.out.println("------------");
		//from JDK 1.5 --> Auto-Boxing
		Integer c = new Integer(a);// method-1(not recommended)
		System.out.println("Non-Primitive => "+c);
		System.out.println("------------");
		Integer d = a;// method-2(implicit type casting)
		System.out.println("Non-Primitive => "+d);
	}
}
