package i_dataStructure.HashSet.IntegerType;

public class Test {
	
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(10);
		h.add(12);
		h.add(13);
		h.add(14);
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("--------");
		
		h.add(20);
		h.add(22);
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("--------");

		System.out.println(h.isEmpty());
		h.remove(14);
		h.display();
		System.out.println(h.remove(10));
		h.display();
	}
}
