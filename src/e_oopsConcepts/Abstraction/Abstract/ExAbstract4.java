package e_oopsConcepts.Abstraction.Abstract;

//We can create object for an abract class by using anonymous class instantiation
//We can able to upcast between 2 abstract class by using anonymous class instantiation
abstract class $H{
 $H(){
     System.out.println("$H constructor");
 }
}
abstract class $I extends $H{
 $I(){
     System.out.println("$I constructor");
 }
}
public class ExAbstract4 {
 @SuppressWarnings("unused")
 public static void main(String[] args) {
     $H h1 = new $H(){};//anonymous class instantiation
     System.out.println("------------");
     $H h2 = new $I(){};
 }
}
