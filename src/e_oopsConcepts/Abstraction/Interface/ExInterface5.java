package e_oopsConcepts.Abstraction.Interface;

//From JDK 8, interface started to allow static, default and From JDK 9, private method
//A non static method with implementation is called default method

interface I6{
 void m1();
 static void m2(){ //implicitly-->public static void
     System.out.println("I6 static m2()");
 }
 default void m3(){ //implicitly public default
     System.out.println("I6 default m3()");
 }
 /*  
 In interface private methods are not possible to use locally
 private void m4(){
     System.out.println("I6 private m4()");
 }
 */
}
class Coin4 implements I6{
 @Override
 public void m1(){
     System.out.println("Coin4 m1()");
 }
}
class Coin5 implements I6{
 @Override
 public void m1(){
     System.out.println("Coin5 m1()");
 }
 @Override
 public void m3(){ //Overriding a default method of interface is not compulsory
     System.out.println("Coin5 m3()");
 }
}
public class ExInterface5 {
 public static void main(String[] args) {
     I6 i = new Coin4();
     i.m1();
     // i.m2(); -->CTE because its a static method
     I6.m2();
     i.m3();
     System.out.println("----------");
     I6 j = new Coin5();
     j.m1();
     j.m3();
 }
}
