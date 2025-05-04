package m_fileHandling.Stream;

// BufferedWriter is a character stream type class which is used to write data to the specified file(Writer class type files)
// In BufferedWriter, if the specified file not exist it will create a new file and write the data
import java.io.*;
public class Example11 {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("D:\\eclipse-workspace-x\\FileHandling\\file2.txt");
		try(BufferedWriter br = new BufferedWriter(file)){//it accepts Writer type as an argument
			br.write("Hello Everyone!\n");
		}
		System.out.println("Executed!");
	}
}
