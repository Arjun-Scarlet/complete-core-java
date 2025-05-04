package e_oopsConcepts.Abstraction.Interface;

//Interface is an intermediate between service-provider program and service-user program
//It is non primitive type and interface implements the class, not extends
interface I1{
 int i = 10; //implicitly-->public static final datatype var_name
 void m1(); //implcitly-->public abstract meth_name(){}
}
class Coin implements I1{ //implemented subclass
 @Override
 public void m1(){ //abstract method must be overridden in an extended class, otherwise make it as abstract class
     System.out.println("Coin m1()");
 }
}
public class ExInterface1 {
 public static void main(String[] args) {
     System.out.println(I1.i);
     // I1.i = 20; -->CTE because its final
     // I1.m1(); -->CTE because its unimplemented abstract method
     Coin c1 = new Coin();
     c1.m1();
 }
}
