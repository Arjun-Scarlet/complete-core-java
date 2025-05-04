package e_oopsConcepts.Abstraction.Interface;

//A class can extend a class and implement an interface at the same time
interface I4{
 void m1();
}
interface I5{
 void m1();
}
class Coin2{
 void m1(){
     System.out.println("Coin2 m1()");
 }
}
class Coin3 extends Coin2 implements I4,I5{ //after extends only we can use implements
 @Override
 public void m1(){
     System.out.println("Coin3 m1()");
 }
}
public class ExInterface4 {
 public static void main(String[] args) {
     I4 a1 = new Coin3();
     a1.m1();

     I5 a2 = new Coin3();
     a2.m1();

     Coin2 a3 = new Coin3();
     a3.m1();

     Coin2 a4= new Coin2();
     a4.m1();
 }
 
}
