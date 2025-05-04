package e_oopsConcepts.Inheritance.superKeyword;

//super keyword is used to refer super class properties in sub class
class Eight{
 int i = 10;
}
class Nine extends Eight{
 int i = 20;
 void m1(){
     System.out.println("Sub class i = "+i);
     System.out.println("Super class i = "+super.i); //refers Eight class variable i value
 }
}
public class superExample4 {
 public static void main(String[] args) {
     Nine n1 = new Nine();
     n1.m1();
 }
}
