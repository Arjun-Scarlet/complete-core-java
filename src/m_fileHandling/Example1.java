package m_fileHandling;

// Folder Creation
import java.io.File;
public class Example1 {
	public static void main(String[] args) {
		File f = new File("D:\\eclipse-workspace-x\\FileHandling");
		boolean b = f.mkdir();// It is used to create folder and returns false if the folder already exists
		System.out.println(b);
	}
}
