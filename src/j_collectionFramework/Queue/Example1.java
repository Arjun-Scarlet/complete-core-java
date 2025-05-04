package j_collectionFramework.Queue;
// Queue is an extended sub-interface of Collection interface
// It follows First-In First-Out
// Implementing subclass --> LinkedList, ArrayDequeue, PriorityQueue
// Implementing sub-interface --> Dequeue

import java.util.Queue;
import java.util.ArrayDeque;
public class Example1 {
	
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
//		q.add(null);--> null values are not allowed
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.contains(10));
		System.out.println(q);
	}
}
