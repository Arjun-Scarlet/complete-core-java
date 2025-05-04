package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

//Creating an instance of sub class type and assigning a reference to super class type reference variable is called Upcasting
class Cast1{
 int i = 10;
 void m1(){
     System.out.println("Cast1 m1()");
     System.out.println("----------");
 }
}
class Cast2 extends Cast1{
 int j = 20;
 void m2(){
     System.out.println("Cast2 m2()");
 }
}
public class Upcast1 {
 public static void main(String[] args) {
     Cast1 c1 = new Cast2(); // Assigning sub class instance(Cast2()) to super class reference variable(Cast1 c1)
     System.out.println("Upcasted c1 call: ");
     System.out.println("Cast1 i = "+c1.i);
     c1.m1();
     // System.out.println(c1.j); -->CTE --> we cannot able to access specific properties of sub class
     // c1.m2(); -->CTE

     Cast2 c2 = new Cast2();
     
     Cast1 x = c2; //upcast method 2
     System.out.println("Upcasted x call: ");
     x.m1(); 

     Cast1 c3 = (Cast1)c2;
     System.out.println("Upcasted c3 call: ");
     c3.m1();
 }
}