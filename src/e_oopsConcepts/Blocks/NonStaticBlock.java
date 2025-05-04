package e_oopsConcepts.Blocks;

public class NonStaticBlock {
    int i;
    //non static block
    {
        System.out.println("Non Static block-1");
        i = 10;
    }
    public static void main(String[] args) {
        NonStaticBlock n1 = new NonStaticBlock();
        System.out.println("main starts");
        System.out.println(n1.i);
        new NonStaticBlock();
        System.out.println("main ends");
    }
    {
        System.out.println("Non Static block-2");
        i = 20;
    }
}