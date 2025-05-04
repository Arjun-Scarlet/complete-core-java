package i_dataStructure.ArrayList;

public class ArrayList {
	private Object[] arr;
	private int pos;
	ArrayList(){
		arr = new Object[5];
	}
	ArrayList(int init) {
		arr = new Object[init];
	}
	
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
	
	public Object get(int index) {
		if(index<-1 || index>=size()) throw new ArrayIndexOutOfBoundsException();
		return arr[index];
	}
	
	public void add(int index, Object e) {
		if(index<-1 || index>size()) throw new ArrayIndexOutOfBoundsException();
		if(pos>=arr.length) increase();
		for(int i=size()-1; i>=index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = e;
		pos++;
	}
	
	public void remove(int index) {
		if(index<-1 || index>=size()) throw new ArrayIndexOutOfBoundsException();
		for(int i=index+1; i<size(); i++) {
			arr[i-1] = arr[i];
		}
		arr[pos--] = null;
	}

	public void display() { //this method is only for understanding purpose
		System.out.print("[");
		for(int i=0; i<size()-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[size()-1]+"]\n");
	}
}


















