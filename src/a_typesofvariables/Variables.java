package a_typesofvariables;

import java.io.Serializable;

public class Variables implements Serializable {
	static int i=10; //static variable or class variable
	int j=25; //non static variable or instance class
	public static void m1(){
		System.out.println("Static variable: "+Variables.i);
	}
	
	public void m2(){
		Variables.i=20; //changing static variable value by declaring class name
		System.out.println("Changed Static variable: "+Variables.i);
	}
	
	public static void m3(){
		Variables y = new Variables(); //creating object to access non static variable
		System.out.println("Non Static variable: "+y.j);
	}

	public static void main(String[] args) {
		int i=5;
		System.out.println("calling method main");
		System.out.println("Local variable: "+i); //local variable
		
		System.out.println("calling method m1");
		m1();
		
		System.out.println("calling method m2");
		Variables x = new Variables();// creating object to call non static method
		x.m2();
		
		System.out.println("calling method m3");
		m3();
	}

}
