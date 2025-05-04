package e_oopsConcepts.Abstraction.Abstract;

//A method without implementation is called Absract method or Incomplete method
//We cannot able to create an object for abstract class
abstract class $A{
 abstract void m1(); //methods does not have any implementation
}
abstract class $B extends $A{

}
class $C extends $B{
 @Override
 void m1(){ //abstract method must be overridden in an extended class, otherwise make it as abstract class
     System.out.println("$C m1()");
 }
}
public class ExAbstract1 {
 public static void main(String[] args) {
     $C c1 = new $C();
     c1.m1();
 }
}
