package j_collectionFramework.Map;
// Map is an interface of Collection framework, but it is not a part of Collection interface
// It stores data in the form of key-value pairs
// 1. HashMap is an implementing subclass of Map interface
// It is an hash based collection, it will stores data based on hash code
// It will not follows insertion order

import java.util.HashMap;
import java.util.Map;
public class Example1 {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('S', 10);
		m.put('A', 20);
		m.put('W', 30);
		m.put('A', 40);//duplicate values will override
		m.put(null, 50);//as a key it stores a single null
		System.out.println(m);
		System.out.println("---------");
		
		m.put('H', null);
		m.put('P', null);//as a value it stores n no.of null
		System.out.println(m);
		System.out.println("---------");
		
		m.remove(null);
		m.remove('P', null);
		System.out.println(m);
		System.out.println("---------");
		
		System.out.println("get(): "+m.get('W'));//returns the value of specified key
		System.out.println("containsKey(): "+m.containsKey('W'));//returns true --> if the specified key is available
		System.out.println("containsValue(): "+m.containsValue(70));//returns true --> if the specified value is available
		System.out.println("---------");
		
		System.out.println(m.entrySet());//returns key and value
		System.out.println(m.keySet());//returns keys
		System.out.println(m.values());//returns values
	}

}
