package n_Java_8_Features.LambdaExpression;

// Form an employee array, print who all are the employee having bonus salary>10000 by finding their bonus

import java.util.function.*;
class Employee {
	String name;
	int sal;
	Employee(String n, int s) {
		name = n;
		sal = s;
	}
	
	@Override
	public String toString() {
		return "Employee[Name: "+name+", Salary: "+sal+"]";
	}
}
public class Test10 {

	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0] = new Employee("Robby", 12000);
		e[1] = new Employee("Miguel", 13000);
		e[2] = new Employee("Hawk", 10000);
		e[3] = new Employee("Tori", 8500);
		//Lambda function for bonus
		Function<Employee,Integer> f = n -> {
			if(n.sal>10000) return (n.sal*20)/100;
			return (n.sal*10)/100;
		};
		//Lambda function for salary>10000
		Predicate<Integer> p = n -> n>10000;
		
		for(Employee i:e) {
			int bonusSal = i.sal+f.apply(i);
			if(p.test(bonusSal)) System.out.println(i+" with Bonus Salary: "+bonusSal);
		}
	}
}
