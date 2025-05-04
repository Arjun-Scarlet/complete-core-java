package e_oopsConcepts.Methods;

public class NonStaticReference {
    int i;
    //non static variable reference in non static method
    void m1(){
        i = 10;
        System.out.println("Reference in non static method => "+i);
    }
    //non static variable reference in static method
    static void m2(){
        NonStaticReference n = new NonStaticReference(); // without object creation code throws cpe here
        n.i = 20;
        System.out.println("Reference in static method => "+n.i);
    }
    //non static variable reference in non static method with same argument name
    void m3(int i){
        System.out.println("Reference in non static method with same argument name => "+i);
    }
    public static void main(String[] args) {
        NonStaticReference n1 = new NonStaticReference();
        n1.m1();
        m2();
        n1.m3(30);
    }
}
