package j_collectionFramework.Queue;

// Deque is an extended sub-interface of Queue interface
// It is double ended queue
// We can add/remove from both ends
// ArrayDeque is an implementing subclass of Queue interface and Deque interface
// It does not stores null values

import java.util.Deque;
import java.util.ArrayDeque;
public class Example2 {

	public static void main(String[] args) {
		Deque<String> d = new ArrayDeque<>();
		d.add("asta");
		d.add("yuno");
		d.add("yami");
		d.add("mereleaona");
		d.add("asta");
//		d.add(null); --> does not stores null values
		System.out.println(d);
		d.remove();
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
	}
}