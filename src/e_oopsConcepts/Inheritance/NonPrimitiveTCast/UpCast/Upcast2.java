package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

class Cast3{
    void m1(){
        System.out.println("Cast3 m1()");
    }
}
class Cast4 extends Cast3{
    void m2(){
        System.out.println("Cast4 m2()");
    }
}
class Cast5 extends Cast4{
    void m3(){
        System.out.println("Cast5 m3()");
    }
}
public class Upcast2 {
    public static void main(String[] args) {
        Cast3 c1 = new Cast4();
        c1.m1();
        // c1.m2(); -->CTE

        Cast3 c2 = new Cast5();
        c2.m1();
        // c2.m2(); -->CTE
        // c2.m3(); -->CTE

        Cast4 c3 = new Cast5();
        c3.m1();
        c3.m2();
        // c3.m3(); -->CTE
    }
}