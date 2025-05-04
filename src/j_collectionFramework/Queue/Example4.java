package j_collectionFramework.Queue;
// LinkedList is also an implementing subclass of Queue interface
// It follows insertion order

import java.util.LinkedList;
import java.util.Queue;
public class Example4 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(null);// null values are allowed
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.contains(10));
		System.out.println(q);
	}

}
