package m_fileHandling.Stream;

// try with resource is a block which is used to close the file connection implicitly
import java.util.Scanner;
public class Example10 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.next();
			System.out.println(s+", your Scanner class connection is closed implicitly!");
		}
//		int n = sc.nextInt();-->CTE
	}
}
