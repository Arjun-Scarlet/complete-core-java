package m_fileHandling.Stream;

// File Writing using Character Stream
// write() is used to write a content or data inside the file
import java.io.FileWriter;
import java.io.IOException;
public class Example1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\eclipse-workspace-x\\FileHandling\\file1.txt");
		fw.write("Hello\n");
		fw.write("Everyone");
		System.out.println("Executed!");
		fw.close();//mandatory to close the file
	}
}
