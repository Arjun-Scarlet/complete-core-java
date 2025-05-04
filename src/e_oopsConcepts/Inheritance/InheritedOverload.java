package e_oopsConcepts.Inheritance;

class Method1{
    void m1(){
        System.out.println("Method1 m1()");
    }
}
class Method2 extends Method1{
    void m1(int i){
        System.out.println("Method2 m1(int)");
    }
}
class Method3 extends Method2{
    void m1(int i, int j){
        System.out.println("Method3 m1(int,int)");
    }
}
public class InheritedOverload {
    public static void main(String[] args) {
        Method3 obj1 = new Method3();
        obj1.m1();
        obj1.m1(10);
        obj1.m1(10,20);
        System.out.println("---------"); 
        Method2 obj2 = new Method2();
        obj2.m1();
        obj2.m1(10);
        // obj2.m1(10,20); -->CTE
    }
}
