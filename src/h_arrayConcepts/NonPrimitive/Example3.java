package h_arrayConcepts.NonPrimitive;

// Interface type Array
interface Car{
	void drive();
}
class BMW implements Car{
	@Override
	public void drive() {
		System.out.println("BMW driving");
	}
}
class Benz implements Car{
	@Override
	public void drive() {
		System.out.println("Benz driving");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Car[] a = new Car[4];
		a[0] = new BMW();
		a[1] = new Benz();
		a[2] = new BMW();
		a[3] = new Benz();
		
		for(Car c:a) {
//			System.out.println(c);-->prints pseudo address
			c.drive();
		}
	}

}
