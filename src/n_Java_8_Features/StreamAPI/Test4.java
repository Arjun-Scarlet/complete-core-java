package n_Java_8_Features.StreamAPI;

import java.util.*;
class Student {
	String name;
	int age;
	Student(String n, int a) {
		name = n;
		age = a;
	}
	
	@Override
	public String toString() {
		return "Student[Name: "+name+", Age: "+age+"]";
	}
}
public class Test4 {

	public static void main(String[] args) {
		List<Student> l = Arrays.asList(
			new Student("Deku", 18),
			new Student("Uraraka", 17),
			new Student("Bakugou", 19),
			new Student("Todoroki", 19)
		);
		l.stream().filter(n -> n.age>18).map(n -> n.name.toUpperCase()).forEach(n -> System.out.println(n));
	}
}
