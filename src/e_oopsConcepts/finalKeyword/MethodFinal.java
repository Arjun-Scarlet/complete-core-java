package e_oopsConcepts.finalKeyword;

//final method cannot be overridden but final method class can be extended
class E1{
 final void m1(){
     System.out.println("E1-m1()");
 }
}
class F1 extends E1{
 /*
 Cannot be overridden
 void m1(){
     System.out.println("F1-m1()");
 }
 */
}
public class MethodFinal {
 public static void main(String[] args) {
     F1 f = new F1();
     f.m1(); //E1-m1()--> F1-m1() cannot be overriden so E1-m1() is called by this statement
 }
}
