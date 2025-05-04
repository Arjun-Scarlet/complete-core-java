package e_oopsConcepts.Encapsulation;

// Wrapping the data members and member functions in a single unit called Encapsulation
// Data encapsulation can be achieved by making data members as private
// By using getters and setters, we can access private data members 
class A{
	private int i;
	private int j;
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	// Getter method (always public and return type can be anything)
	// Getter is used to get the private data members value
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	// Setter method (always public and return type is void)
	// Setter is used to modify the private data members value
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
}
public class Example1 {

	public static void main(String[] args) {
		A a1 = new A(10,20);
//		a1.i = 15;-->CTE
//		System.out.println(a1.j);-->CTE
		System.out.println(a1.getI()+" and "+a1.getJ());
		System.out.println("----------");
		a1.setI(15); // modify or updates the private variables
		a1.setJ(25);
		System.out.println(a1.getI()+" and "+a1.getJ());
	}

}