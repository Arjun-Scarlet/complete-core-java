package n_Java_8_Features.InnerClass;

public class Test7 {

	static class A{//static IC
		int i = 10;
		static int j = 20;
	}
	class B{//non static IC
		int k = 15;
		static int l = 25;
	}
	public void m1() {//method local IC
		class C{
			int m = 30;
			static int n = 40;
			void display() {
				System.out.println("m = "+m+"\nn = "+n);
			}
		}
		new C().display();
	}
	public static void main(String[] args) {
		Test7.A a = new A();
		System.out.println("i = "+a.i);
		System.out.println("j = "+A.j);
		System.out.println("---------");
		
		Test7 e1 = new Test7();
		B b = e1.new B();
		System.out.println("k = "+b.k);
		System.out.println("l = "+B.l);
		System.out.println("---------");
		
		e1.m1();
		System.out.println("---------");
		
		new Test7() {//anonymous inner class
			int o = 35;
			static int p = 45;
			void print() {
				System.out.println("o = "+o+"\np = "+p);
			}
		}.print();
	}
}
