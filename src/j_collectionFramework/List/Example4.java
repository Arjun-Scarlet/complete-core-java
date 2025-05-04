package j_collectionFramework.List;
//2. Stack is an implementing subclass of List interface and extended subclass of Vector class
//It follows First-In First-Out
//It is not an index based Collection

import java.util.Stack;
public class Example4 { 
	
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("Midoriya");
		s1.push("Killua");
		s1.push("Mikey");
		s1.push("Senku");
		s1.push(null);// it allow to store null values
		s1.push("Senku");// it allow to store duplicates 
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println("size: "+s1.size());
		System.out.println("peek: "+s1.peek());
		System.out.println("get: "+s1.get(2));
	}
}
