package i_dataStructure.LinkedList.Single;

class Node {
	Object ele;
	Node next;
	Node(Object e, Node n) {
		ele = e;
		next = n;
	}
	Node(Object e) {
		ele = e;
	}
}

public class SinglyLinkedList {
	private Node head;
	private int count = 0;
	public void add(Object e) {
		Node n = new Node(e);
		if(head==null) {
			head = n;
			count++;
			return;
		}
		Node curr = head;
		while(curr.next!=null) curr = curr.next;
		curr.next = n;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public void addFirst(Object e) {
		Node n = new Node(e);
		n.next = head;
		head = n;
		count++;
	}
	
	public void add(int index, Object e) {
		if(index<0 || index>size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			addFirst(e);
			return;
		}
		Node n = new Node(e);
		Node curr = head;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		n.next = curr.next;
		curr.next = n;
		count++;
	}
	
	public Object get(int index) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		Node curr = head;
		for(int i=1; i<=index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	
	public void remove(int index) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			head = head.next;
			count--;
			return;
		}
		Node curr = head;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
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