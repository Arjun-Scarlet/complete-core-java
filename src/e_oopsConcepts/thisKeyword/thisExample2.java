package e_oopsConcepts.thisKeyword;

//this() helps to refer another constructor of the same class
class C {
 C(){
     // this(10, 20); --> cyclic call of constructor throws CTE
     System.out.println("0 arg constructor");
 }
 C(int i){
     this(); //calls C()
     System.out.println("1 arg constructor");
 }
 C(int a, int b){
     this(10); //calls C(int)
     System.out.println("2 arg constructor");
 }
}
public class thisExample2 {
 public static void main(String[] args) {
     new C(20, 30);
 }    
}
