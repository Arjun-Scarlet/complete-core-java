package n_Java_8_Features.InnerClass;

// 4. Anonymous Inner class(creating a nameless class which is associated with class/interface)
// It is a type of method local inner class and it doesn't exist independently
// It doesn't have any modifiers and access modifiers
// Anonymous inner class provide temporary implementation for methods
class Watch {
	void brand() {
		System.out.println("Titan watch");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Watch w1 = new Watch();
		w1.brand();
		System.out.println("---------");
		
		// Way-1 (associated with other class)
		Watch w2 = new Watch() //it is an anonymous inner class, not a Watch class object
		{
			@Override
			void brand() {
				System.out.println("Rolex watch");
				price();
			}
			void price() {
				System.out.println("1500.Rs");
			}
		};
		w2.brand();//calling anonymous inner class overridden method
//		w2.price();--> CTE(outside we can't access any other method except overridden method)
		System.out.println("---------");
		
		// Way-2 (only anonymous inner class, without associated with other class)
		new Watch() //it is an anonymous inner class, not a Watch class object
		{
			@Override
			void brand() {
				System.out.println("Fastrack watch");
			}
		}.brand();
		System.out.println("---------");
		
		System.out.println(w1.getClass().getName());
		System.out.println(w2.getClass().getName());
	}
}
