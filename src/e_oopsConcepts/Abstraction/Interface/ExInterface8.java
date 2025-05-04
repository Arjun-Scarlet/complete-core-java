package e_oopsConcepts.Abstraction.Interface;

// If a class implements more than 1 interface which is having same default method, 
// then overriding the default method in implemented subclass is mandatory 
interface I11 {
	default void m1() {
		System.out.println("I11-m1()");
	}
}

interface I12 {
	default void m1() {
		System.out.println("I12-m1()");
	}
}

class Coin9 implements I11, I12 {
	@Override
	public void m1() {
		System.out.println("Coin9-m1()");
	}
}

public class ExInterface8 {

	public static void main(String[] args) {
		I11 i = new Coin9();
		i.m1();
		I12 j = new Coin9();
		j.m1();
	}
}
