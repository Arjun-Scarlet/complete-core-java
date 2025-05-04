package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

//Creating an instance of super class and assigning the reference to the sub class type reference variable is called Downcasting
class Down{
 void m1(){
     System.out.println("Down m1()");
 }
}
class Down1 extends Down{
 void m2(){
     System.out.println("Down1 m2()");
 }
}
class Down2 extends Down{
 void m3(){
     System.out.println("Down2 m3()");
 }
}
public class Downcast1 {
 public static void main(String[] args) {
     Down d1 = new Down1(); //Downcasting is not possible without Upcasting
     Down1 d2 = (Down1)d1;
     d2.m1();
     d2.m2();
     // d2.m3(); -->CTE
     System.out.println("---------");
     Down d3 = new Down2();
     Down2 d4 = (Down2)d3;
     d4.m1();
     // d4.m2(); -->CTE
     d4.m3();
 }
}
