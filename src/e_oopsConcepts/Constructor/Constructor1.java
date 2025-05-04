package e_oopsConcepts.Constructor;

class A1 {
    //Constructor Overloading
    A1(){
        System.out.println("0 arg or default constructor");
    }
    A1(int n){
        System.out.println("1 int constructor");
    }
    A1(int a, int b){
        System.out.println("2 int constructor");
    }
}
class B1 {
    //default constructor implicitly created by compiler
}
public class Constructor1 {
    public static void main(String[] args) {
        //Initializing object without storing
        new A1();
        new A1(10);
        new A1(20, 30);
        
        new B1(); //no output
    }
}
