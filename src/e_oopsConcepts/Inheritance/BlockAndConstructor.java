package e_oopsConcepts.Inheritance;

class A2{
    static{
        System.out.println("Static block A2");
    }
    {
        System.out.println("Non Static block A2");
    }
    A2(){
        System.out.println("Constructor A2");
    }
}
class B2 extends A2{
    static{
        System.out.println("Static block B2");
    }
    {
        System.out.println("Non Static block B2");
    }
    B2(){
        System.out.println("Constructor B2");
    }
}
public class BlockAndConstructor {
    public static void main(String[] args) {
        new B2();
    }
}
