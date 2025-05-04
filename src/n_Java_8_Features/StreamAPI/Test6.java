package n_Java_8_Features.StreamAPI;

// Achieving Has-a relationship by using functional programming(with the help of Stream API)
import java.util.*;
import java.util.stream.Collectors; 
class Employee {
	int id;
	String name;
	int dept_id;
	Employee(int i, String n, int d){
		id = i;
		name = n;
		dept_id = d;
	}
	
	@Override
	public String toString() {
		return "Employee[id: "+id+", name: "+name+"]";
	}
}

class Department {
	int id;
	String dept;
	Department(int i, String d) {
		id = i;
		dept = d;
	}
	
	@Override
	public String toString() {
		return "Department[id: "+id+", dept: "+dept+"]";
	}
}
public class Test6 {
	
	public static void main(String[] args) {
		List<Employee> emp = List.of(new Employee(1, "megumi", 101),
									 new Employee(2, "itadori", 102),
									 new Employee(3, "nobara", 103),
									 new Employee(4, "maki", 103),
									 new Employee(5, "yuta", 102));
		
		List<Department> dept = List.of(new Department(101, "ECE"),
				 						new Department(102, "CSE"),
				 						new Department(103, "BME"));
		
		//Mapping departments by id
		Map<Integer, String> m1 = dept.stream().collect(Collectors.toMap(n1->n1.id, n2->n2.dept));
		
		//Establish relationship
		Map<String, List<Employee>> m2 = emp.stream().collect(Collectors.groupingBy(n->m1.get(n.dept_id)));
		
		m2.forEach((department,empList)->{
			System.out.println("Department: "+department);
			empList.forEach(n->System.out.println(n));
		});
		
//		m2.forEach((n,m)->System.out.println(n+" "+m));
	}
}

// toMap() --> used to collect the stream elements as a map
// groupingBy() --> grouping elements according to the classification function, and returning the results in a Map

















