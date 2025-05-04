package e_oopsConcepts.Abstraction.Interface;

interface I9{
    void m1();
    default void m2(){
        System.out.println("I9 default m2()");
    }
}
interface I10{
    void m1();
    default void m2(){
        System.out.println("I10 default m2()");
    }
}
abstract class Coin7{
    abstract void m1();
    void m2(){
        System.out.println("abstract Coin7 m2()");
    }
}
class Coin8 extends Coin7 implements I9, I10{
    @Override
    public void m1() {
        System.out.println("Coin8 m1()");
    }
    @Override
    public void m2(){
        super.m2(); //calls super class method
        I9.super.m2();
        I10.super.m2();
        System.out.println("Coin8 m2()");
    }
}
public class ExInterface7 {
    public static void main(String[] args) {
        I10 i = new Coin8();
        i.m1();
        i.m2();
    }
}
