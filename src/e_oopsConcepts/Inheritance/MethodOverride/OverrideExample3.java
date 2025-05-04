package e_oopsConcepts.Inheritance.MethodOverride;

//Overriding methods having a sub class as its return type is called co-variant type

class A3{
 Animal m1(){
     System.out.println("A3 m1()--> Animal type");
     return new Animal();
 }
}
class B3 extends A3{
 @Override
 public Cat m1(){ //co-variant type
     System.out.println("B3 m1()--> Cat type");
     return new Cat();
 }
 /*  
 Giving unmatched return type will throw CTE. Here, SmartPhone class is not a sub class of Animal super class
 @Override
 public SmartPhone m1(){
     System.out.println("B3 m1()--> SmartPhone type");
     return new SmartPhone();
 }
 */
}
public class OverrideExample3 {
 public static void main(String[] args) {
     B3 b = new B3();
     b.m1();
 }
}
