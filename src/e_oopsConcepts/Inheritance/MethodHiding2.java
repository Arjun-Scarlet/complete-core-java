package e_oopsConcepts.Inheritance;

class End1{
    // static m1() of super class is hidden by static m1() of sub class
    // non-static m2() of super class is hidden by an overridden m2() of sub class
    static void m1(){
        System.out.println("Static method of E1");
    }
    void m2(){
        System.out.println("Non Static method of E1");
    }
}
class End2 extends End1{
    static void m1(){
        System.out.println("Static method of F1");
    }
    @Override
    void m2(){
        System.out.println("Non Static method of F1");
    }
}
public class MethodHiding2 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        End2 f = new End2();
        f.m1();
        f.m2();
    }
}
