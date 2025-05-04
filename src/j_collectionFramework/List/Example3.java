package j_collectionFramework.List;
// 2. Vector is an implementing subclass of List interface
// It is introduced at JDK-1.0(Legacy Class)
// It follows insertion order and index based Collection
// Methods are synchronized in Vector class and Thread safe(single threaded)

import java.util.Vector;
public class Example3 { 
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Midoriya");
		v.add("Killua");
		v.add("Mikey");
		v.add("Senku");
		v.add(null);// it allow to store null values
		v.add("Senku");// it allow to store duplicates 
		System.out.println(v);
		System.out.println(v.remove(4));
		System.out.println(v);
		System.out.println("size: "+v.size());
		System.out.println("get: "+v.get(2));
	}
}
