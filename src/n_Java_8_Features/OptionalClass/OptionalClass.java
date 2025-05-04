package n_Java_8_Features.OptionalClass;

// Optional class is a container object and introduced at Java 8
// It helps to deal with null values in more controlled and safe manner

import java.util.Optional;

class Person {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}

public class OptionalClass {

	public static void main(String[] args) {
		Optional<Person> o1 = Optional.of(new Person(1, "Scarlet"));
		Optional<Person> o2 = Optional.empty();
		
		//isPresent() returns true if value is present, else false
		System.out.println("isPresent():");
		System.out.println("Optional o1: "+o1.isPresent());
		System.out.println("Optional o2: "+o2.isPresent()+"\n");
		
		//get() returns the value if present, else throws an exception
		if(o1.isPresent()) {
			Person p1 = o1.get();
			System.out.println("get(): "+p1+"\n");
		}
		
		//orElse() returns the value if present, else returns the specified value
		Person p2 = new Person(0, "Default");
		Person res1 = o2.orElse(p2);//here p2 is the specified value
		System.out.println("orElse(): "+res1);
		
		//orElseGet() returns the value if present, else calls a supplier function 
		Person res2 = o2.orElseGet(()->new Person(2, "Scarlet"));
		System.out.println("orElseGet(): "+res2);
		
		//orElseThrow() returns the value if present, else throws an exception
		try {
			Person res3 = o2.orElseThrow(()->new RuntimeException("Person Not Found!"));
			System.out.println("orElseThrow(): "+res3);
		}
		catch(Exception e) {
			System.out.println("orElseThrow():");
			e.printStackTrace();
		}
	}
}










