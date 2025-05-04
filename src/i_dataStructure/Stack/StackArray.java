package i_dataStructure.Stack;

import java.util.EmptyStackException;

class Stack {
	private Object[] arr = new Object[5];
	private int pos;
	
	private void increase() {
		Object[] temp = new Object[arr.length+3];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public void push(Object e) {
		if(pos>=arr.length) increase();
		for (int i=pos; i>0; i--) {
	        arr[i] = arr[i-1];
	    }
		arr[0] = e;
		pos++;
	}
	
	public int size() {
		return pos;
	}
	
	public boolean isEmpty() {
		return pos==0;
	}
	
	public Object pop() {
		if(isEmpty()) throw new EmptyStackException();
		Object e = arr[0];
		for(int i=1; i<size(); i++) {
			arr[i-1] = arr[i];
		}
		arr[--pos] = null;
		return e;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		return arr[0];
	}
	
	public void display() {
		for(int i=0; i<size(); i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class StackArray { 

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		
		s.pop();
		s.display();
		System.out.println("peek: "+s.peek());
		s.pop();
		s.display();
		System.out.println("size: "+s.size());
	}

}














