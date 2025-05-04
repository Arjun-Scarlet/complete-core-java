package e_oopsConcepts.Abstraction.Interface.InterfaceTypes;

//An interface is having only one abstract method is called Functional Interface
//To indicate functional interface, java providing @FunctionalInterface annotation

@FunctionalInterface
interface I{
 void m1();
 // void m2(); -->CTE

 // Functional Interface can have more than 1 static, default and private methods
 static void m2(){ 
     System.out.println("I static m2()");
 }
 default void m3(){
     System.out.println("I default m3()");
 }
 /* 
 private static void m4(){
     System.out.println("I private m4()");
 }
 */
}
class Test implements I{
 @Override
 public void m1(){
     System.out.println("Test m1()");
 }
}
public class Type3 {
 public static void main(String[] args) {
     I i = new Test();
     i.m1();
     I.m2();
     i.m3();
     // I.m4(); -->CTE
 }
}
