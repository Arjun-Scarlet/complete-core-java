package e_oopsConcepts.Cloning.Deep;

// In Deep cloning, the object will clone along with referred properties
// It copies both outer and inner objects
// Changes in cloned object will not affects original object
class Address implements Cloneable{
	String state;
	String country;
	Address(String s, String c){
		state = s;
		country = c;
	}
	
	@Override
	public String toString() {
		return "Address[State: "+state+", Country: "+country+"]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
