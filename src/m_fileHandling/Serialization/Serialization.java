package m_fileHandling.Serialization;

// The process of converting Object state to Byte stream format is known as Serialization
// static and transient data members are not participated in serialization
// We can achieve serializable by using ObjectOutputStream class
// ObjectOutputStream class accepts only OutputStream type class as an argument
import java.io.*;
public class Serialization {
	
	public static void main(String[] args) throws IOException {
		Student s1 = new Student("Robin", 21, 921926189, 101);
		FileOutputStream file = new FileOutputStream("D:\\eclipse-workspace-x\\FileHandling\\file2.txt");
		try(ObjectOutputStream o = new ObjectOutputStream(file)){
			o.writeObject(s1);//Serialization
		}
		System.out.println("Executed!");
	}
}
