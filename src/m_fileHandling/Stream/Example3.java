package m_fileHandling.Stream;

// File Writing using Byte Stream
import java.io.FileOutputStream;
import java.io.IOException;
public class Example3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream("D:\\eclipse-workspace-x\\FileHandling\\file1.txt",true);//boolean true parameter means it will prevent the file from overwriting the content
		String s = "Have a nice day!";
		byte[] b = s.getBytes();//converts string into byte as an array
		fw.write(b);
		fw.close();
		System.out.println("Executed!");
	}
}
