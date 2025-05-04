package m_fileHandling.Serialization;

// The process of converting Byte stream to Object state format is known as Deserialization
// We can achieve deserializable by using ObjectInputStream class
//ObjectInputStream class accepts only InputStream type class as an argument
import java.io.*;
public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("D:\\eclipse-workspace-x\\FileHandling\\file2.txt");
		try(ObjectInputStream o = new ObjectInputStream(file)){
			Student s = (Student)o.readObject();//Deserialization
			System.out.println(s);//age and regNo is 0 because it is transient and static data member 
		}
	}
}
