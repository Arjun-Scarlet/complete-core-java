package m_fileHandling.Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Example2 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\eclipse-workspace-x\\FileHandling\\file1.txt");
		FileWriter fw = new FileWriter(file);
		if(file.canWrite()) {
			fw.write("Hello ");
			fw.write("Everyone\n");
		}
		else System.out.println("Can't write the data!");
		fw.close();
		System.out.println("Executed!");
	}
}
