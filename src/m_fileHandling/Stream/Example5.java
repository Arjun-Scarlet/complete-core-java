package m_fileHandling.Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Example5 {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		int n = fr.read();
		while(n!=-1) {
			System.out.print((char)n);
			n = fr.read();
		}
		fr.close();
	}
}
