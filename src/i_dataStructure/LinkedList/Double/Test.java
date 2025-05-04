package i_dataStructure.LinkedList.Double;

public class Test {

	public static void main(String[] args) {
		DoubleLinkedList l = new DoubleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		l.add(2, 25);
		l.add(0, 5);
		l.display();
		System.out.println("size: "+l.size());
		System.out.println("-------");
		
		System.out.println("get: "+l.get(3));
		l.remove(0);
		l.remove(4);
		l.display();
		System.out.println("size: "+l.size());
	}

}
