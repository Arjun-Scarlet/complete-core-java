package e_oopsConcepts.Cloning;

// Creating an exact copy of an object is called Cloning
// Only Cloneable implemented subclass objects will be cloned, otherwise it throws CloneNotSupportedException
class Mobile implements Cloneable{
	String name;
	int ram;
	int rom;
	Mobile(String n, int r1, int r2){
		name = n;
		ram = r1;
		rom = r2;
	}
	@Override
	public String toString() {
		return "Mobile[Name: "+name+", Ram: "+ram+", Rom: "+rom+']';
	}
	
	@Override
	//clone() is used to clone the object and it is protected method in Object class
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class Example {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mobile m1 = new Mobile("Vivo", 8, 32);
		System.out.println(m1);
		System.out.println("------------");
		Mobile m2 = (Mobile)m1.clone();//clone() returns Object type so we are down-casting with Mobile
		System.out.println(m2);
	}

}
