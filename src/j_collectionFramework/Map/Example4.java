package j_collectionFramework.Map;
// LinkedHashMap is an implementing subclass of Map interface
// It follows insertion order

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		m.put('S', 10);
		m.put('A', 20);
		m.put('H', 30);
		m.put('I', 40);
		m.put('a', 50);
		Set<Character> s1 = m.keySet();
		Iterator<Character> i = s1.iterator();
		while(i.hasNext()) {
			char key = i.next();
			int val = m.get(key);
			System.out.println(key+"="+val);
		}
	}

}









