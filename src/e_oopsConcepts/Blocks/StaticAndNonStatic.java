package e_oopsConcepts.Blocks;

public class StaticAndNonStatic {
    static int i;
    int j;
    static{
        System.out.println("Static Block-1");
        i = 10;
    }

    {
        System.out.println("Non Static Block-1");
        i = 20;
        j = 30;
    }
    public static void main(String[] args) {
        StaticAndNonStatic x = new StaticAndNonStatic();
        System.out.println(i);
        System.out.println(x.j);
    }

    {
        System.out.println("Non Static Block-2");
        i = 30;
        j = 40;
    }

    static{
        System.out.println("Static Block-2");
        i = 50;
    }
}
