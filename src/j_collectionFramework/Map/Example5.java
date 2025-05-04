package j_collectionFramework.Map;
// TreeSet is an implementing subclass of Map interface
// It is used for sorting the data based on key
// It will not store any null values

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		m.put('S', 10);
		m.put('A', 20);
		m.put('H', 30);
		m.put('I', 40);
		m.put('a', 50);
//		m.put(null, null);-->NullPointerException
		Set<Character> s1 = m.keySet();
		Iterator<Character> i = s1.iterator();
		while(i.hasNext()) {
			char key = i.next();
			int val = m.get(key);
			System.out.println(key+"="+val);
		}
	}

}
