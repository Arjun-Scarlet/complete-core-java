package j_collectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('S', 10);
		m.put('A', 20);
		m.put('H', 30);
		m.put('I', 40);
		m.put('a', 50);
		
		// Printing method-1 (print statement)
		System.out.println(m);
		System.out.println("----------");
		
		// Printing method-2 (using entrySet())
		//direct print
		System.out.println(m.entrySet());
		System.out.println();
		//with iteration
		Set<Entry<Character,Integer>>s = m.entrySet();
		for(Entry<Character,Integer> n:s) {
			System.out.println(n);
		}
		System.out.println("----------");
		
		//Printing method-3 (using iterator)
		Set<Character> s1 = m.keySet();
		Iterator<Character> i = s1.iterator();
		while(i.hasNext()) {
			char key = i.next();
			int val = m.get(key);
			System.out.println(key+"="+val);
		}
	}

}









