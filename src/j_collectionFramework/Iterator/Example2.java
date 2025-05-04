package j_collectionFramework.Iterator;

// Printing elements using Iterator
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Example2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No.of Elements: ");
		int n = sc.nextInt();
		List<Integer> l = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			l.add(sc.nextInt());
		}
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		sc.close();
	}
}
