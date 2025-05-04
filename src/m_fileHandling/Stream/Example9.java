package m_fileHandling.Stream;

// No. of iteration using BufferedReader
import java.io.*;
public class Example9 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\eclipse-workspace-x\\Java_Fullstack\\src\\f_stringConcepts\\Example4.java");
		BufferedReader br = new BufferedReader(file);//it accepts Reader type as an argument
		String s = br.readLine();
		int cnt = 0;
		while(s!=null) {
			cnt++;
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		System.out.println("Iteration Count: "+cnt);
	}
}
