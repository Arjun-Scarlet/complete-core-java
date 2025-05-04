package e_oopsConcepts.Object;

public class ReferenceCopy {
    int i;
    public static void main(String[] args) {
        ReferenceCopy r1 = new ReferenceCopy();
        r1.i = 10;
        System.out.println("r1 object value => "+r1.i);
        ReferenceCopy r2 = r1; //copying r1 object reference to r2
        System.out.println("r2 copy object value => "+r2.i);

        r2 = new ReferenceCopy(); //calling r2 with new object creation
        System.out.println("r2 new object value => "+r2.i);

        r2.i = 20;
        System.out.println("r2 object value => "+r2.i);
        r2 = null; // abandon object
        System.out.println("Abandon object without reference address => "+r2);
    }
}
