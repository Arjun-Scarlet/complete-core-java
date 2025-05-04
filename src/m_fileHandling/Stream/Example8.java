package m_fileHandling.Stream;

// Buffered classes are more efficient to read/write the data in file
// In this class, initially the data will be stored in temporary memory called buffered memory
// BufferedReader is a character stream type class which is used to read the specified file data(Reader class type files)
import java.io.*;
public class Example8 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		BufferedReader br = new BufferedReader(file);//it accepts Reader type as an argument
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
	}
}
