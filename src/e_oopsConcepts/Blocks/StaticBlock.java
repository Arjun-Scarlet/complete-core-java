package e_oopsConcepts.Blocks;

public class StaticBlock {
    static int i;
    //static block
    static{
        System.out.println("Static block-1");
        i = 10;
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println(i);
        System.out.println("main ends");
    }
    static{
        System.out.println("Static block-2");
        i = 20;
    }
}