package e_oopsConcepts.Inheritance.superKeyword;

//super() helps to call immediate super class constructor
//Calling one constructor to another is called Constructor chain

class One{
 One(){
     //super() will add implicitly and points to Object class constructor
     System.out.println("One class Cons");
 }
}
class Two extends One{
 Two(){
     super();
     System.out.println("Two class Cons");
 }
}
class Three extends Two{
 Three(){
     //super() will add implicitly and points to Two class constructor
     System.out.println("Three class Cons");
 }
}
public class superExample1 {
 public static void main(String[] args) {
     new Three();
     System.out.println("----------");
     new Two();
 }
}