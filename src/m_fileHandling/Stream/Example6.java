package m_fileHandling.Stream;

// No. of iteration using InputStream
import java.io.FileInputStream;
import java.io.IOException;

public class Example6 {
	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		int n = fr.read();
		int cnt = 0;
		while(n!=-1) {
			cnt++;
			System.out.print((char)n);
			n = fr.read();
		}
		fr.close();
		System.out.println("Iteration Count: "+cnt);
	}
}
