package h_arrayConcepts.NonPrimitive.Comparator;

import java.util.Arrays;
import java.util.Comparator;
// Comparator with Generic type
class Employee implements Comparable<Employee> {
	String name;
	double sal;
	int id;
	static int init = 100;
	Employee(String n, double s){
		name = n;
		sal = s;
		id = init++;
	}
	
	@Override
	public String toString() {
		return "Employee[Name: "+name+", Salary: "+sal+", EmpId: "+id+"]";
	}
	
	@Override
	public int compareTo(Employee e) {
		return id - e.id;
	}
}

class SalCompare implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.sal<e2.sal) return 1;
		else if(e1.sal>e2.sal) return -1;
		return 0;
	}
}

class NameCompare implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}

public class Example2 {

	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0] = new Employee("Riya", 25000);
		e[1] = new Employee("Hawk", 20000);
		e[2] = new Employee("Meeni", 40500);
		e[3] = new Employee("Geeni", 42000);
		Arrays.sort(e);
		System.out.println("EmpId Comparison Sort using Comparable:");
		for(Employee i:e) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		
		Arrays.sort(e, new SalCompare());
		System.out.println("Salary Comparison Sort using Comparator:");
		for(Employee i:e) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		
		Arrays.sort(e, new NameCompare());
		System.out.println("Name Comparison Sort using Comparator:");
		for(Employee i:e) {
			System.out.println(i);
		}
	}

}











