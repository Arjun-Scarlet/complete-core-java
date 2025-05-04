package e_oopsConcepts.Inheritance;

//Creating a sub class static method with same method signature as super class static method is called Method Hiding
class C1 {
 static int i = 10;
	static void display(){
	    System.out.println("A display()");
	}
}
class D1 extends C1 {
 static int i = 15;
	static void display(){
	    System.out.println("B display() with i = "+i);
	}
}

public class MethodHiding1 {
 public static void main(String[] args) {
     D1.display();
 }
}
