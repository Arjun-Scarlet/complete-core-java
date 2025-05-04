package j_collectionFramework.List;
// List is a pre-defined sub-interface of Collection interface
// 1. ArrayList is an implementing subclass of List interface
// It internally stores the element in the form of Object
// Initial capacity --> 10, Load Factor --> Half of its Initial Capacity

import java.util.ArrayList;
import java.util.List;
public class Example1 {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		System.out.println(l1.isEmpty());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(20);// allows duplicate values
		l1.add(null);// allows null values
		System.out.println("size: "+l1.size()); 
		l1.remove(5);
		l1.remove(4);
		System.out.println("l1: "+l1);
		System.out.println(l1.indexOf(20));
		System.out.println("---------");
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(l1); // Add all the element from l1
		l2.add(50);
		l2.add(60);
		System.out.println("l2: "+l2);
		l2.removeAll(l1); // Removes all the element of l1
		System.out.println("l2: "+l2);
		System.out.println("---------");
		
		l2.addAll(l1);
		l2.retainAll(l1); // Removes all the element except l1 elements
		System.out.println("l2: "+l2);
		l2.clear();
		System.out.println(l2);
	}
}
