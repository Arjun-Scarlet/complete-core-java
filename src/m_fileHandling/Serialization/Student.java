package m_fileHandling.Serialization;

// transient is a keyword used for data members
// If any data member is prefixed with transient keyword, that data member is cannot able to participate in serialization
import java.io.Serializable;
public class Student implements Serializable{
	String name;
	transient int age;
	long phnNo;
	static int regNo;
	Student(String n, int a, long no, int reg){
		name = n;
		age = a;
		phnNo = no;
		regNo = reg;
	}
	@Override
	public String toString() {
		return "Student[Name: "+name+", Age: "+age+", Phn No: "+phnNo+", Reg No: "+regNo+"]";
	}
}
