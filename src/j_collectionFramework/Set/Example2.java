package j_collectionFramework.Set;
// 2. LinkedHashSet is an implementing subclass of Set interface
// It stores the element based on hash code
// It follows insertion order

import java.util.LinkedHashSet;
import java.util.Set;
public class Example2 {
	
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>(); 
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