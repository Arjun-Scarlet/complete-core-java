package e_oopsConcepts.Object.ObjAsParameter;

class E{
int i;
E(int i){
    this.i = i;
}
}
class F{
    int i;
    F(int i){
        this.i = i;
    }
    void method(E obj){
        System.out.println("Current object: "+i); //current object
        System.out.println("Called object: "+obj.i); //called object
    }
}
public class ObjectAsArgs2 {
    public static void main(String[] args) {
        E e1 = new E(10);

        F f1 = new F(20);
        
        f1.method(e1);
    }
}
