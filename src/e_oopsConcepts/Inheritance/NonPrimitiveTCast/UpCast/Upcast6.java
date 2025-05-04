package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

//Upcasting with same static method name or method hiding

class Cast15{
 static void m1(){
     System.out.println("Cast15 static m1()");
 }
}
class Cast16 extends Cast15{
 static void m1(){
     System.out.println("Cast16 static m1()");
 }
}
class Cast17 extends Cast15{
 static void m1(){
     System.out.println("Cast17 static m1()");
 }
}
public class Upcast6 {
 @SuppressWarnings("static-access")
 public static void main(String[] args) {
     Cast15 c1 = new Cast16();
     c1.m1();

     c1 = new Cast17();
     c1.m1();
 }
}
