package e_oopsConcepts.Cloning.Deep;

class Person implements Cloneable{
	String name;
	String phnNo;
	Address address;
	Person(String n, String phn, Address a){
		name = n;
		phnNo = phn;
		address = a;
	}
	
	@Override
	public String toString() {
		return "Person[Name: "+name+", Phn No: "+phnNo+", "+address+"]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person)super.clone();
		p.address = (Address)address.clone();
		return p;
	}
}