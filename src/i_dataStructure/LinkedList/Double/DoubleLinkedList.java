package i_dataStructure.LinkedList.Double;

class Node {
	Object ele;
	Node next;
	Node prev;
	Node(Object e){
		ele = e;
	}
	Node(Object e, Node n, Node p){
		ele = e;
		next = n;
		prev = p;
	}
}

public class DoubleLinkedList {
	private Node head;
	private int count;
	
	public void add(Object e) {
		if(head==null) {
			head = new Node(e);
			count++;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = new Node(e,null,curr);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public void remove(int index) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			head = head.next;
			head.prev = null;
			count--;
			return;
		}
		Node curr = head;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		if(curr.next!=null) curr.next.prev = curr; 
		count--;
	}
	
	public Object get(int index) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		Node curr = head;
		for(int i=1;i<=index;i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	
	public void add(int index, Object e) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			head = new Node(e,head,null);
			head.next.prev = head;
			count++;
			return;
		}
		
		Node curr = head;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(e, curr.next, curr);
		curr.next.next.prev = curr.next;
		count++;
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














