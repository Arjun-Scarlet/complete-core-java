package e_oopsConcepts.Object;

public class ObjectCall {
    int i;
    //calling current object(method outside object) from m1
    void m1(){
        System.out.println("Current object call value => "+i);
    }
    //calling called object(method insde object) from m2
    void m2(){
        ObjectCall ob = new ObjectCall();
        ob.i = 20;
        System.out.println("Called object value => "+ob.i);
    }
    public static void main(String[] args) {
        ObjectCall obj1 = new ObjectCall();
        obj1.i = 10;
        obj1.m1();

        ObjectCall obj2 = new ObjectCall();
        obj2.i = 5;//this value is not called by m2
        obj2.m2();
    }
}