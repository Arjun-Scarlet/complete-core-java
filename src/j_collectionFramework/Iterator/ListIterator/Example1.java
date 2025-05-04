package j_collectionFramework.Iterator.ListIterator;
// List iterator is a sub-interface of Iterator interface
// It can be used to iterate only List type collection.
// It can iterate both forward and backward direction

import java.util.Arrays;
import java.util.ListIterator;
import java.util.List;
public class Example1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10,20,30,40,50);
		ListIterator<Integer> i = l.listIterator();
		System.out.println(i.hasNext());
		System.out.println("Forward Direction: ");
		while(i.hasNext()) {
			System.out.println(i.nextIndex()+" --> "+i.next());
		}
		System.out.println("Backward Direction: ");
		while(i.hasPrevious()) {
			System.out.println(i.previousIndex()+" --> "+i.previous());
		}
	}

}
