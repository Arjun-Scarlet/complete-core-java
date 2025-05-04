package i_dataStructure.HashSet.ObjectType;

class Node {
	Object key;
	Node next;
	Node(Object k){
		key = k;
	}
	Node(Object k, Node n){
		key = k;
		next = n;
	}
}

public class HashSet {
	private Node[] arr = new Node[10];
	private int count = 0;
	
	public boolean add(Object k) {
		int hc = k.hashCode();//it creates an unique hash value for an object
		hc = Math.abs(hc);
		int index = hc%arr.length;
		if(arr[index]==null) {
			arr[index] = new Node(k);
			count++;
			return true;
		}
		if(k.equals(arr[index].key)) return false;
		
		Node curr = arr[index];
		while(curr.next!=null) {
			if(k.equals(curr.next.key)) return false;
			curr = curr.next;
		}
		curr.next = new Node(k);
		count++;
		return true; 
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean remove(Object k) {
		int hc = Math.abs(k.hashCode());
		int index = hc%arr.length;
		Node curr = arr[index];
		if(curr==null) return false;
		if(k.equals(curr.key)) {
			arr[index] = curr.next;
			count--;
			return true;
		}
		while(curr.next!=null) {
			if(k.equals(curr.next.key)) {
				curr.next = curr.next.next;
				count--;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	public void display() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				Node curr = arr[i];
				while(curr!=null) {
					System.out.println(curr.key);
					curr = curr.next;
				}
			}
		}
	}
}
