package e_oopsConcepts.Methods;

public class StaticReference {
    static int i;
    //static variable direct reference in static method
    static void m1(){
        i = 10;
        System.out.println("Reference in static method => "+i);
    }
    //static variable direct reference in non static method
    void m2(){
        i = 20;
        System.out.println("Reference in non static method => "+i);
    }
    //static variable reference in static method with same argument name
    static void m3(int i){
        System.out.println("Method argument => "+i);
        StaticReference.i = 40;
        System.out.println("Reference in static method with same argument name => "+StaticReference.i);
    }
    public static void main(String[] args) {
        m1();
        StaticReference s1 = new StaticReference();
        s1.m2();
        m3(30);
    }
}
