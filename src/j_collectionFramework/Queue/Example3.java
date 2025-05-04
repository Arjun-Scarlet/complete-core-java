package j_collectionFramework.Queue;

import java.util.ArrayDeque;
public class Example3 {
	
	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
//		a.add(null);
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);
		a.addFirst(15);
		a.addLast(55);
		System.out.println(a);
	}
}