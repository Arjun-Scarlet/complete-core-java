package j_collectionFramework.Set;
// 3. TreeSet is an implementing subclass of Set interface
// It is developed using balanced tree
// It follows sorting order and stores Homogeneous type data

import java.util.TreeSet;
import java.util.Set;
public class Example3 {
	
	public static void main(String[] args) {
		Set<Character> s = new TreeSet<Character>();
		s.add('A');
		s.add('R');
		s.add('J');
		s.add('U');
		s.add('N');
		s.add('A');// not allow to store duplicate values
		System.out.println(s);
//		s.add(null);--> NullPointerException(not allow to store null values)
	}
}
