package j_collectionFramework.Queue;
// PriorityQueue is an implementing subclass of Queue interface
// It adds the element based on its priority

import java.util.PriorityQueue;
import java.util.Queue;

public class Example5 {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(15);
		q.add(25);
		q.add(5);
		q.add(35);
		q.add(45);
//		q.add(null);--> null values are not allowed
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.contains(15));
		q.add(10);
		q.add(2);
		System.out.println(q);
	}

}
