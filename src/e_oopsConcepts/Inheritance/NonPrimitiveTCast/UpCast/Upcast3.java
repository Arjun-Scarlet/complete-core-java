package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

//Upcasting with same non static method name or overridden method

class Cast6{
 void m1(){
     System.out.println("Cast6 m1()");
 }
}
class Cast7 extends Cast6{
 @Override
 void m1(){
     System.out.println("Cast7 m1()");
 }
}
public class Upcast3 {
 public static void main(String[] args) {
     Cast6 c1 = new Cast7();
     c1.m1(); //Cast7 m1()
 }
}
