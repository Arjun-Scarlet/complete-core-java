package i_dataStructure.Stack;

import java.util.EmptyStackException;

class Node {
	Object ele;
	Node next;
	Node(Object e){
		ele = e;
	}
	Node(Object e, Node n){
		ele = e;
		next = n;
	}
}

class Stack1 {
	private Node head;
	private int count;
	
	public void push(Object e) {
		if(head == null) {
			head = new Node(e);
			count++;
			return;
		}
		head = new Node(e, head);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public Object pop() {
		if(isEmpty()) throw new EmptyStackException();
		Object e = head.ele;
		head = head.next;
		count--;
		return e;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		return head.ele;
	}
	
	public void display() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.ele+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}
public class StackLinkedList {

	public static void main(String[] args) {
		Stack1 s = new Stack1();
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("size: "+s.size());
		s.display();
		s.pop();
		s.pop();
		s.display();
		System.out.println("size: "+s.size());
		System.out.println("peek: "+s.peek());
		s.display();
	}

}



















