package j_collectionFramework.Iterator;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Example3 {
	
	public static void main(String[] args) {
		Set<Character> s = new LinkedHashSet<Character>();
		s.add('A');
		s.add('R');
		s.add('J');
		s.add('U');
		s.add('N');
		s.add('S');
		System.out.println(s);
		Iterator<Character> i = s.iterator();
		while(i.hasNext()) {
			if(i.next()=='S') i.remove();
		}
		System.out.println(s);
	}
}
