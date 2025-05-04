package e_oopsConcepts.Inheritance;

class Ones{
    int i;
    void m1(){
        System.out.println("m1 starts");
        System.out.println("i value: "+i);
        System.out.println("m1 ends");
    }
}
class Twos extends Ones{
    int j;
    void m2(){
        System.out.println("m2 starts");
        System.out.println("i value: "+i);
        System.out.println("j value: "+j);
        System.out.println("m2 ends");
    }
}
public class ExInhertance {
	public static void main(String[] args) {
        Ones o1 = new Ones();
        o1.i = 10;
        o1.m1();
        System.out.println("------------");
        
        Twos t1 = new Twos();
        t1.i = 20;
        t1.j = 30;
        t1.m1();
        t1.m2();
    }
}
