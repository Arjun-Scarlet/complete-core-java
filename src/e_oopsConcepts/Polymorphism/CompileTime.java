package e_oopsConcepts.Polymorphism;

//One entity showing the behavior of another or many entity called Polymorphism 
//Call to the overloaded method resolved at compile time by compiler based on name and argument called Compile-time Polymorphism
class Overload{
 // Constructor Overloading
 Overload(){
     System.out.println("Constructor()");
 }
 Overload(int i){
     System.out.println("Constructor(int)");
 }
 Overload(String str){
     System.out.println("Constructor(String)");
 }

 // Method Overloading
 void method(){
     System.out.println("Method()");
 }
 void method(int i){
     System.out.println("Method(int)");
 }
 void method(String s){
     System.out.println("Method(String)");
 }
}
public class CompileTime {
 public static void main(String[] args) {
     Overload o1 = new Overload();
     o1 = new Overload(10);
     o1 = new Overload("hello");
     System.out.println("----------");
     o1.method();
     o1.method(15);
     o1.method("hai");
 }
}
