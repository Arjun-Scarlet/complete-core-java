package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

//Object class
class Cast8 extends Object{}
class Cast9 extends Object{}
class Cast10{}
class Cast11 extends Cast10{}
public class Upcast4 {
 static void m1(Object o){
     System.out.println("m1 is called...");
 }
 public static void main(String[] args) {
     System.out.print("m1(new Cast8())--> ");
     m1(new Cast8());
     System.out.print("m1(new Cast9())--> ");
     m1(new Cast9());
     System.out.print("m1(new Cast10())--> ");
     m1(new Cast10());
     System.out.print("m1(new Cast11())--> ");
     m1(new Cast11());
 }
}
