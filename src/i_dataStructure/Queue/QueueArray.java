package i_dataStructure.Queue;

class Queue {
	private Object[] arr = new Object[5];
	private int pos;
	
	private void increase() {
		Object[] temp = new Object[arr.length+3];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public void add(Object e) {
		if(pos>=arr.length) increase();
		arr[pos++] = e;
	}
	
	public int size() {
		return pos;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public Object poll() {
		if(isEmpty()) return null;
		Object e = arr[0];
		for(int i=0; i<size(); i++) {
			arr[i] = arr[i+1];
		}
		arr[pos--] = null;
		return e;
	}
	
	public Object peek() {
		if(isEmpty()) return null;
		return arr[0];
	}
	
	public void display() { //this method is only for understanding purpose
		System.out.print("[");
		for(int i=0; i<size()-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[size()-1]+"]\n");
	}
}
public class QueueArray {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.display();
		System.out.println("--------");
		q.poll();
		q.display();
		System.out.println("peek: "+q.peek());
		q.poll();
		q.poll();
		System.out.println(q.poll());
		
	}

}
