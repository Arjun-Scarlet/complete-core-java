package i_dataStructure.LinkedList.Circular;

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

public class CircularLinkedList {
	private Node head;
	private int count;
	
	public void add(Object e) {
		if(head==null) {
			head = new Node(e);
			head.next = head;
			count++;
			return;
		}
		
		Node curr = head;
		while(curr.next!=head) {
			curr = curr.next;
		}
		curr.next = new Node(e, head);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public void remove(int index) {
		if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
			}
			head = head.next;
			curr.next = head;
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
	
	public void add(int index, Object e) {
		if(index<0 || index>size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
			}
			head = new Node(e, head);
			curr.next = head;
			count++;
			return;
		}
		Node curr = head;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(e, curr.next);
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
	
	public void display() {
		Node curr = head;
		do{
			System.out.print(curr.ele+" ");
			curr = curr.next;
		} while(curr!=head);
		System.out.println();
	}
}