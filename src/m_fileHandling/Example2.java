package m_fileHandling;

//File Creation
import java.io.File;
import java.io.IOException;
public class Example2 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\eclipse-workspace-x\\FileHandling\\file1.txt");
		System.out.println(f.createNewFile());// It is used to create file and returns false if the file already exists
		System.out.println(f.canExecute());// It checks whether the file is executable or not
		System.out.println(f.canRead());// It checks whether the file is readable or not
		System.out.println(f.canWrite());// It checks whether the file is wirte-able or not
		System.out.println(f.getName());// Returns file name
		System.out.println(f.getAbsolutePath());// Returns file path
		System.out.println("-------");
		
		File f1 = new File("H:\\eclipse-workspace\\FileHandling\\file1.mp3");
		System.out.println(f1.createNewFile());
		System.out.println(f1.delete());// It is used to delete the specified file
	}
}
