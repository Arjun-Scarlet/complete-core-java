package b_methodCall;
//Calling static method from main method
public class StaticMethodCall {

	public static void m1(){
		System.out.println("m1 is called");
	}
	public static void main(String[]args){
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}

}
