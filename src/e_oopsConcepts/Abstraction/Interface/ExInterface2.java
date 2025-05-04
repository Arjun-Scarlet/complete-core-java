package e_oopsConcepts.Abstraction.Interface;

//interface only extends another interface
interface I2{
 void m1();
}
interface I3 extends I2{
 void m2();
}
class Coin1 implements I3{
 @Override
 public void m1(){
     System.out.println("Coin1 m1()");
 }
 @Override
 public void m2(){
     System.out.println("Coin1 m2()");
 }
 public void m3(){
     System.out.println("Coin1 m3()");
 }
}
public class ExInterface2 {
 public static void main(String[] args) {
     I2 i = new Coin1();//upcasting
     i.m1();
     // i.m2(); -->CTE
     // i.m3(); -->CTE
     System.out.println("--------");
     I3 j = new Coin1();
     j.m1();
     j.m2();
     // j.m3(); -->CTE
     System.out.println("--------");
     Coin1 c = new Coin1();
     c.m1();
     c.m2();
     c.m3();
 }
}
