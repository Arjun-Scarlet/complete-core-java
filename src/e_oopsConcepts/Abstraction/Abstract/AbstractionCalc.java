package e_oopsConcepts.Abstraction.Abstract;

//Abstraction achieved by abstract class (calculator program)
abstract class $J{
 abstract void add(int a, int b);
 abstract void sub(int a, int b);
 abstract void mul(int a, int b);
 abstract void div(int a, int b);
 abstract void mod(int a, int b);
}
class $K extends $J{
 @Override
 void add(int a, int b){
     int res = a+b;
     System.out.println("Addition: "+res);
 }
 @Override
 void sub(int a, int b){
     int res = a-b;
     System.out.println("Subtraction: "+res);
 }
 @Override
 void mul(int a, int b){
     int res = a*b;
     System.out.println("Multiplication: "+res);
 }
 @Override
 void div(int a, int b){
     int res = a/b;
     System.out.println("Division: "+res);
 }
 @Override
 void mod(int a, int b){
     int res = a%b;
     System.out.println("Modulus: "+res);
 }
}
public class AbstractionCalc {
 public static void main(String[] args) {
     $J a1 = new $K();
     a1.add(10, 20);
     a1.sub(5, 10);
 }
}
