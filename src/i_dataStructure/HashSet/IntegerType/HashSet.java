package i_dataStructure.HashSet.IntegerType;

class Node {
	int key;
	Node next;
	Node(int k){
		key = k;
	}
	Node(int k, Node n){
		key = k;
		next = n;
	}
}

public class HashSet {
    private Node[] arr = new Node[10];
	private int count = 0;
	
	public boolean add(int k) {
		int index = k%arr.length;
		if(arr[index]==null) {
			arr[index] = new Node(k);
			count++;
			return true;
		}
		if(arr[index].key==k) return false;//removes duplicates in array
		
		Node curr = arr[index];
		while(curr.next!=null) {
			if(curr.next.key==k) return false;//removes duplicates in node
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
	
	public boolean remove(int k) {
		int index = k%arr.length;
		Node curr = arr[index];
		if(curr==null) return false;
		if(curr.key==k) {
			arr[index] = curr.next;
			count--;
			return true;
		}
		while(curr.next!=null) {
			if(curr.next.key==k) {
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
					System.out.print(curr.key+" ");
					curr = curr.next;
				}
			}
		}
		System.out.println();
	}
}