package i_dataStructure.LinkedList.Single;

public class Test {
	public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.display();
		System.out.println("---------");
		l.add(2,25);
		l.add(0,45);

		l.addFirst(5);
		l.display();
		System.out.println("size: "+l.size());
		System.out.println("---------");
		l.remove(0);
		l.remove(4);
		l.display();
		System.out.println("get: "+l.get(2));
		System.out.println("size: "+l.size());
		System.out.println("---------");
		l.reverse();
		l.display();
	}
}
