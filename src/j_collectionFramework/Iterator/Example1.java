package j_collectionFramework.Iterator;
// Iterator is an interface used to iterate any type of Collection
// It is also known as "Universal Cursor"
// It can only iterate the Collection in forward direction

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Example1 {
	
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		for(int i=10; i<=50; i+=10) l.add(i);
		
		Iterator<Integer> i = l.iterator();
		System.out.println(i.hasNext());// checks if there is any next element
		System.out.println(i.next());// returns current element
		i.remove(); //removes 1st element
		System.out.println(l);
	}
}
