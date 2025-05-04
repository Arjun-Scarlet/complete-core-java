package e_oopsConcepts.Inheritance.MethodOverride;

//Providing new implementation to the inherited method is called Method Overriding

class Over1{
 int i = 10;
 void m1(){
     System.out.println("Over1 m1()");
 }
}
class Over2 extends Over1{
 int i = 20;
 @Override //helps to indicate error if there is a method mismatch
 void m1(){ //overriden method 
     System.out.println("Over2 m1()");
     System.out.println(super.i+" and "+i);
 }
}
public class OverrideExample {
 public static void main(String[] args) {
     Over2 o1 = new Over2();
     o1.m1();
 }
}
