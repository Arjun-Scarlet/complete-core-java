package n_Java_8_Features.LambdaExpression;

// Create a Student array with the parameters such as name and array of marks
// Check the student average mark is greater than 90 and display by using Lambda expression with the help of functional interfaces

import java.util.*;
import java.util.function.*;

class Student {
	String name;
	int[] marks;
	Student(String n,int[] m){
		name = n;
		marks = m;
	}
}
public class Test14 {

	public static void main(String[] args) {
		Student[] std = new Student[4];
		std[0] = new Student("yaoyorozu", new int[]{97,92,100,91,95});
		std[1] = new Student("Bakugou", new int[]{93,87,98,87,90});
		std[2] = new Student("Midoriya", new int[]{91,85,93,87,92});
		std[3] = new Student("Todoroki", new int[]{90,95,80,85,92});
		
		Predicate<Integer> p = n->n>90;
		
		Function<int[],Integer> f = n->{
			int sum = 0;
			for(int i=0; i<n.length; i++) {
				sum += n[i];
			}
			return sum/(n.length);
		};
		
		Consumer<Student> c = n->System.out.println(n.name+" "+Arrays.toString(n.marks));
		
		for(Student i:std) {
			if(p.test(f.apply(i.marks))) c.accept(i);
		}
		
		Supplier<Student> s = ()->new Student("Iida", new int[]{87,83,88,81,92});
		System.out.println(s.get().name+" "+Arrays.toString(s.get().marks));
	}
}





