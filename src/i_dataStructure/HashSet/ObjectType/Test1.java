package i_dataStructure.HashSet.ObjectType;

public class Test1 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("deku");
		h.add("deku");
		h.add("uraraka");
		h.add("bakugou");
		h.add("todoroki");
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("--------");
		
		h.add("killua");
		h.add("gojo");
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("--------");

		System.out.println(h.isEmpty());
		h.remove("gojo");
		h.display();
		System.out.println("--------");
		
		System.out.println(h.remove("todoroki"));
		h.display();
	}
}
