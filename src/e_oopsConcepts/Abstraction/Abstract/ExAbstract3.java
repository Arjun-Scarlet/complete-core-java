package e_oopsConcepts.Abstraction.Abstract;

//We can create a constructor for abstract classes
//Upcasting between 2 abstract classes is not possible but we can upcast an abstract class and normal or concrete class
abstract class $D{
 $D(){
     System.out.println("$D constructor");
 }
 abstract void m1();
}
abstract class $E extends $D{
 $E(){
     System.out.println("$E constructor");
 }
}
abstract class $F extends $E{
 $F(){
     System.out.println("$F constructor");
 }
}
class $G extends $F{
 @Override
 void m1(){
     System.out.println("$G m1()");
 }
}
public class ExAbstract3 {
 @SuppressWarnings("unused")
 public static void main(String[] args) {
     $G g1 = new $G();
     System.out.println("---------");
     $F f1 = new $G(); //upcasting
     // $D d1 = new $D(); -->CTE
 }
}