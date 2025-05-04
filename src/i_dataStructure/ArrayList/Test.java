package i_dataStructure.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println("size: "+a.size());
		a.display();
		System.out.println("---------");
		
		a.add(2, 25);
		a.display();
		a.remove(3);
		a.display();
		System.out.println("get: "+a.get(3));
	}
}
