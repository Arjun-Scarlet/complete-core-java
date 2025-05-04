package i_dataStructure.LinkedList.Circular;

public class Test {
	public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.display();
        System.out.println("size: "+c.size());
        c.remove(0);
        c.remove(1);
        c.display();
        System.out.println("size: "+c.size());
        System.out.println("--------");
        c.add(0, 15);
        c.add(1, 35);
        c.add(4, 25);
        c.display();
        System.out.println("size: "+c.size());
        System.out.println("get: "+c.get(2));
    }
}
