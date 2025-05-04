package n_Java_8_Features.InnerClass;

// 3. Method Local Inner class(creating a class inside a method)
// It is also known as Rarely used Inner class
// Method local inner class data members and methods only accessible inside the Outer class method
public class Test3 {
	
	public static void main(String[] args) {
		class C {
			void m1(int a, int b) {
				System.out.println("a = "+a+", b = "+b);
			}
			public static void main(String[] args) {
				System.out.println("Method Local inner class main()");
			}
		}
		C c1 = new C();
		c1.m1(25, 35);
		C.main(null);
	}
}
