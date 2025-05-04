package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

//istanceof used to check a reference variable type is belong to the given class/interface type or not
class Pets{
 void m1(){
     System.out.println("Pets m1()");
 }
}
class Dog extends Pets{
 void m2(){
     System.out.println("Dog m2()");
 }
}
class Puppy extends Dog{
 void m3(){
     System.out.println("Puppy m3()");
 }
}
class Cat extends Pets{
 void m4(){
     System.out.println("Cat m4()");
 }
}
public class Downcast3 {
 public static void main(String[] args) {
     Pets p1 = new Puppy();
     // Using instanceof operator, we can avoid ClassCastException
     System.out.println(p1 instanceof Puppy);
     System.out.println(p1 instanceof Dog);
     System.out.println(p1 instanceof Cat);
     System.out.println(p1 instanceof Pets);
 }
}
