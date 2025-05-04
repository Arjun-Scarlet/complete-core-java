package e_oopsConcepts.Inheritance.superKeyword;

//super keyword is also used to call or refer super class method in sub class 
class Ten{
 void displayTen(){
     System.out.println("displayTen()");
 }
}
class Eleven extends Ten{
 void displayEleven(){
     System.out.println("displayEleven()");
     super.displayTen(); // calling super class method
 }
}
public class superExample5 {
 public static void main(String[] args) {
     Eleven e1 = new Eleven();
     e1.displayEleven();
 }
}
