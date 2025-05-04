package n_Java_8_Features.StreamAPI.Reference;

// 2. Non-Static method reference is also known as Instance method reference
// It is used when a lambda function invokes the instance/non-static method of a specified object
@FunctionalInterface
interface I4 {
	void add(int a, int b);
}

public class InstanceMR1 {

	void sum(int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
	public static void main(String[] args) {
		InstanceMR1 n1 = new InstanceMR1();//object is specified
		//using instance method reference
		I4 i = n1::sum;
		i.add(15, 30);
	}
}
