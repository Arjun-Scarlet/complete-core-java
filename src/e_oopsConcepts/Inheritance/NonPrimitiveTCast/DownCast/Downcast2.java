package e_oopsConcepts.Inheritance.NonPrimitiveTCast.DownCast;

class Down3{
    void m1(){
        System.out.println("Down3 m1()");
    }
}
class Down4 extends Down3{
    void m2(){
        System.out.println("Down4 m2()");
    }
}
class Down5 extends Down4{
    void m3(){
        System.out.println("Down5 m3()");
    }
}
public class Downcast2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Runtime ClassCastException:
        // Scenario-1: Downcasting without upcasting
        Down3 d1 = new Down3();
        Down4 d2 = (Down4)d1;

        // Scenario-2: Upcasted reference type and downcasted reference type is different
        Down3 d3 = new Down4();
        Down5 d4 = (Down5)d3;
    }
}
