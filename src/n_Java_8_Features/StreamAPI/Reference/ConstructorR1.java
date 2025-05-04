package n_Java_8_Features.StreamAPI.Reference;

// Constructor Reference is used to refer a constructor without instantiation
// 1. Default Constructor Reference
import java.util.function.Supplier;
class Student1 {
	String name = "Izuku Midoriya";
	String power = "One for All";
}

public class ConstructorR1 {

	public static void main(String[] args) {
		Supplier<Student1> s = Student1::new;//creates an instance of Student class
		Student1 std = s.get();
		System.out.println(std.name+" with "+std.power);
	}
}
