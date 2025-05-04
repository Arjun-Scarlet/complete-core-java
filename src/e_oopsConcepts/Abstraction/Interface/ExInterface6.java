package e_oopsConcepts.Abstraction.Interface;

//Overriding interface in extended interface
interface I7{
 void m1();
}
interface I8 extends I7{
 @Override
 default void m1(){ //interface overriding
     System.out.println("I8 m1()");
 }
}
class Coin6 implements I7{
 @Override
 public void m1(){
     System.out.println("Coin6 m1()");
 }
}
public class ExInterface6 {
 public static void main(String[] args) {
     I7 i = new Coin6();
     i.m1();
 }
}
