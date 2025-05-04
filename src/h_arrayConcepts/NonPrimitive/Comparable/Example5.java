package h_arrayConcepts.NonPrimitive.Comparable;

import java.util.Arrays;
// Comparable with Generic type
class Student implements Comparable<Student>{
	String name;
	int regNo;
	Student(String n, int rno){
		name = n;
		regNo = rno;
	}
	
	@Override
	public String toString() {
		return "Student[Name: "+name+", RegNo: "+regNo+"]";
	}
	
	@Override
	public int compareTo(Student s) {
//		return regNo-s.regNo; --> For integer comparison
		return name.compareTo(s.name); // --> For String comparison
	}
}
public class Example5 {

	public static void main(String[] args) {
		Student[] a = new Student[2];
		a[0] = new Student("Pakar", 1015);
		a[1] = new Student("Harry", 1020);
		System.out.println(a[0].compareTo(a[1])); // Compares first letter of 2 strings
		
		Arrays.sort(a);// it sorts the arrays based on compareTo()
		for(Student s:a) System.out.println(s);
	}

}
