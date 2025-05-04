package e_oopsConcepts.Polymorphism;

//Call to the overridden method resolved at runtime by JVM based on instance creation called Run-time Polymorphism
//Runtime Polymorphism is also known as Dynamic method dispatch
class Override1{
 // Method Overriding
 void m1(){
     System.out.println("Override1 m1()");
 }
}
class Override2 extends Override1{
 @Override
 void m1(){
     System.out.println("Override2 m1()");
 }
}
class Override3 extends Override2{
 @Override
 void m1(){
     System.out.println("Override3 m1()");
 }
}
public class RunTime {
 public static void main(String[] args) {
     Override3 o1 = new Override3();
     o1.m1();
 }
}
