package e_oopsConcepts.Binding;

//Binding a method call with method implementation at compile time is called Early Binding.
//Overload method call signature is binded at compile time
class Bind{
 void m1(int i){
     System.out.println("m1(int)");
 }
 void m1(double d){
     System.out.println("m1(double)");
 }
 void m1(String s){
     System.out.println("m1(String)");
 }
}
public class EarlyBinding {
 public static void main(String[] args) {
     Bind b1 = new Bind();
     b1.m1(10);
     b1.m1(10.0);
     b1.m1("10");
 }
}
