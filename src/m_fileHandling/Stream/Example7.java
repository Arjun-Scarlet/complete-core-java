package m_fileHandling.Stream;

// File content transferring
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Example7 {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		FileWriter fw = new FileWriter("D:\\eclipse-workspace-x\\FileHandling\\file1.txt");
		int n = fr.read();
		while(n!=-1) {
			fw.write(n);
			n = fr.read();
		}
		fr.close();
		fw.close();
		System.out.println("Executed!");
	}
}
