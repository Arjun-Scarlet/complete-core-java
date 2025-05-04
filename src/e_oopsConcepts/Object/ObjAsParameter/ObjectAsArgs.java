package e_oopsConcepts.Object.ObjAsParameter;

class ExampleA{
    int i;
    ExampleA(int i){
        this.i = i;
    }
}
class ExampleB{
    void m1(ExampleA obj){
        System.out.println(obj.i);
        System.out.println("-------------");
    }
}
public class ObjectAsArgs {
    public static void main(String[] args) {
        ExampleB b1 = new ExampleB();
        ExampleA a1 = new ExampleA(10);
        ExampleA a2 = new ExampleA(20);

        b1.m1(a1);
        b1.m1(a2);
        b1.m1(new ExampleA(30));
    }    
}
