package e_oopsConcepts.Cloning.Shallow;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Gojo", "4685278952", new Address("Shibuya", "Japan"));
        System.out.println(p1);

        Person p2 = (Person) p1.clone();
        System.out.println(p2);

        System.out.println("--------");
        p2.name = "Megumi";
        p2.address.state = "Tokyo";
        System.out.println(p2);
        System.out.println(p1);
	}

}
