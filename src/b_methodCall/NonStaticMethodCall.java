package b_methodCall;
//Calling non static method from main method
public class NonStaticMethodCall {

	public void m2(){
		System.out.println("m2 is called");
	}
	public static void main(String[]args){
		System.out.println("main starts");
		NonStaticMethodCall x = new NonStaticMethodCall(); //Object Creation
		x.m2();
		System.out.println("main ends");
	}

}
