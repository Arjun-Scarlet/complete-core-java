package m_fileHandling.Stream;

// File Reading
// read() is used to read a file content char by char
// If the file content exists it returns the byte value of that character. Otherwise, it returns -1.
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		fr.close();
	}
}
