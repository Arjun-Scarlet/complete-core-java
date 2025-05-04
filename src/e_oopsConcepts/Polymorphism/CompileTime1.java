package e_oopsConcepts.Polymorphism;

class UPI {
	
}
class NetBanking {
	
}
class CreditCard {
	
}

class Payment {
	void pay(UPI u) {
		System.out.println("UPI payment success!");
	}
	void pay(NetBanking n) {
		System.out.println("Net Banking payment success!");
	}
	void pay(CreditCard c) {
		System.out.println("Creadit Card payment success!");
	}
}

public class CompileTime1 {
	
	public static void main(String[] args) {
		Payment p1 = new Payment();
		p1.pay(new UPI());
		
		Payment p2 = new Payment();
		p2.pay(new NetBanking());
		
		Payment p3 = new Payment();
		p3.pay(new CreditCard());
	}
}