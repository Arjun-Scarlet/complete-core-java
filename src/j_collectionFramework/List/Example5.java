package j_collectionFramework.List;
// 3. LinkedList is an implementing subclass of List and Queue interface
// It stores the data in the form of node and connected to its next node
// It follows insertion order

import java.util.List;
import java.util.LinkedList;
public class Example5 { 
	
	public static void main(String[] args) {
		List<String> s1 = new LinkedList<String>();
		s1.add("Midoriya");
		s1.add("Killua");
		s1.add("Mikey");
		s1.add("Senku");
		s1.add(null);// it allow to store null values
		s1.add("Senku");// it allow to store duplicates 
		System.out.println(s1);
		System.out.println(s1.remove(1));
		System.out.println("size: "+s1.size());
		System.out.println("getFirst: "+s1.getFirst());
		System.out.println("getLast: "+s1.getLast());
		System.out.println(s1.contains(null));
		System.out.println("get: "+s1.get(2));
	}
}
