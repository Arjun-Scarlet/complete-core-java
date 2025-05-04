package i_dataStructure.HashSet.ObjectType;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student("Deku", 95);
		Student s2 = new Student("Deku", 95);
		Student s3 = new Student("Uraraka", 80);
		Student s4 = new Student("Bakugou", 98);
		Student s5 = new Student("Todoroki", 93);
		
		HashSet h = new HashSet();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("----------");
		
		System.out.println(h.isEmpty());
		Student s6 = new Student("Killua",93);
		Student s7 = new Student("Gon", 84);
		h.add(s6);
		h.add(s7);
		h.display();
		System.out.println("size: "+h.size());
		System.out.println("----------");
		
		h.remove(s5);
		h.remove(s7);
		h.display();
		System.out.println("size: "+h.size());
	}
}
