package e_oopsConcepts.Methods;

//Creating multiple methods with same name but different parameter length or different datatype is called Method Overload

public class MethodOverload{

 static void method(int a) {
     System.out.println("Method: 1 => "+a);
 }
 static void method(int a, int b) {
     System.out.println("Method: 2 => "+a*b);
 }
 static void method(String str) {
     System.out.println("Method: 3 => "+str);
 }
 static void method() {
     System.out.println("Method without argument");
 }
 public static void main(String[] args) {
     method(15);
     method(5,-7);
     method("Shadow");
     method();
 }
}