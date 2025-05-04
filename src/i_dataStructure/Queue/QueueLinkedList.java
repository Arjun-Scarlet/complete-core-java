package i_dataStructure.Queue;

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
class Queue1{
	private Node head;
	private int count = 0;
	
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
		curr.next = new Node(e);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object poll() {
		if(isEmpty()) return null;
		Object ele = head.ele;
		head = head.next;
		count--;
		return ele;
		
	}
	
	public Object peek() {
		return head.ele;
	}
	
	public void display() { //Not in actual queue
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.ele+" ");
			curr = curr.next;
		}
		System.out.println();
	}
}
public class QueueLinkedList {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.isEmpty());
		q.display();
		System.out.println("size: "+q.size());
		System.out.println("-------");
		
		System.out.println(q.peek());//10
		q.poll();// remove 10
		System.out.println(q.peek());//20
		q.poll();//remove 20
		System.out.println(q.size());
		System.out.println(q.peek());//30
		q.poll();//remove 30
		System.out.println(q.isEmpty());
	}

}
