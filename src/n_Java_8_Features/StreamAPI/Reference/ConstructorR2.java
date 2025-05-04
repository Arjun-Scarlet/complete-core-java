package n_Java_8_Features.StreamAPI.Reference;

// 2. Parameterized Constructor Reference
class Student2 {
	String name;
	String power;
	Student2(String n, String p){
		name = n;
		power = p;
	}
}

@FunctionalInterface
interface I {
	Student2 getInstance(String s1, String s2);
}

public class ConstructorR2 {

	public static void main(String[] args) {
		I i = Student2::new;
		Student2 std = i.getInstance("Izuku Midoriya", "One for All");
		System.out.println(std.name+" with "+std.power);
	}
}
