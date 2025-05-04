package i_dataStructure.HashSet.ObjectType;

// hashCode() is an Object class non-static method used to create an unique identifier or hash value for an object
// Overriding hashCode() avoids collision
// If the hashCode() is not overridden when equals() is overridden, it will generate different hash code for 2 objects with same values
public class Student {
	String name;
	int mark;
	Student(String n, int m){
		name = n;
		mark = m;
	}
	 
	@Override
	public int hashCode() {
		return mark;
	}
	
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		return name.equals(s.name) && mark==s.mark;
	}
	
	@Override
	public String toString() {
		return "Student[Name: "+name+", Mark: "+mark+"]";
	}
}
