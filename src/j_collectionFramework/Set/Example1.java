package j_collectionFramework.Set;
// Set is a sub-interface of Collection interface
// 1. HashSet is an implementing subclass of Set interface
// It stores the element based on hash code
// It does not follows insertion order

import java.util.HashSet;
import java.util.Set;
public class Example1 {
	
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); 
		s.add("Deku");
		s.add("Uraraka");
		s.add(null);
		s.add("Bakugou");
		s.add("Deku");// not allow to store duplicate values
		s.add(null);// allow to store only one null value
		System.out.println(s);
		s.remove("Uraraka");
		System.out.println(s);
	}
}
